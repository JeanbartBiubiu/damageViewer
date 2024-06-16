package xyz.game.service;

import xyz.game.entity.Language;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Language)表服务接口
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
public interface LanguageService {

    /**
     * 通过ID查询单条数据
     *
     * @param languageId 主键
     * @return 实例对象
     */
    Language queryById(Integer languageId);

    /**
     * 分页查询
     *
     * @param language 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Language> queryByPage(Language language, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param language 实例对象
     * @return 实例对象
     */
    Language insert(Language language);

    /**
     * 修改数据
     *
     * @param language 实例对象
     * @return 实例对象
     */
    Language update(Language language);

    /**
     * 通过主键删除数据
     *
     * @param languageId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer languageId);

}
