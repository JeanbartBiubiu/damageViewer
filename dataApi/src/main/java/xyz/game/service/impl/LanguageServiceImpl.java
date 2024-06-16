package xyz.game.service.impl;

import xyz.game.entity.Language;
import xyz.game.dao.LanguageDao;
import xyz.game.service.LanguageService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Language)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@Service("languageService")
public class LanguageServiceImpl implements LanguageService {
    @Resource
    private LanguageDao languageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param languageId 主键
     * @return 实例对象
     */
    @Override
    public Language queryById(Integer languageId) {
        return this.languageDao.queryById(languageId);
    }

    /**
     * 分页查询
     *
     * @param language 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Language> queryByPage(Language language, PageRequest pageRequest) {
        long total = this.languageDao.count(language);
        return new PageImpl<>(this.languageDao.queryAllByLimit(language, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param language 实例对象
     * @return 实例对象
     */
    @Override
    public Language insert(Language language) {
        this.languageDao.insert(language);
        return language;
    }

    /**
     * 修改数据
     *
     * @param language 实例对象
     * @return 实例对象
     */
    @Override
    public Language update(Language language) {
        this.languageDao.update(language);
        return this.queryById(language.getLanguageId());
    }

    /**
     * 通过主键删除数据
     *
     * @param languageId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer languageId) {
        return this.languageDao.deleteById(languageId) > 0;
    }
}
