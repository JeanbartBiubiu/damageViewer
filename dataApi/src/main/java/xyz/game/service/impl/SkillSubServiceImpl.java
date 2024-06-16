package xyz.game.service.impl;

import xyz.game.entity.SkillSub;
import xyz.game.dao.SkillSubDao;
import xyz.game.service.SkillSubService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (SkillSub)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@Service("skillSubService")
public class SkillSubServiceImpl implements SkillSubService {
    @Resource
    private SkillSubDao skillSubDao;

    /**
     * 通过ID查询单条数据
     *
     * @param skillId 主键
     * @return 实例对象
     */
    @Override
    public SkillSub queryById(Integer skillId) {
        return this.skillSubDao.queryById(skillId);
    }

    /**
     * 分页查询
     *
     * @param skillSub 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SkillSub> queryByPage(SkillSub skillSub, PageRequest pageRequest) {
        long total = this.skillSubDao.count(skillSub);
        return new PageImpl<>(this.skillSubDao.queryAllByLimit(skillSub, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param skillSub 实例对象
     * @return 实例对象
     */
    @Override
    public SkillSub insert(SkillSub skillSub) {
        this.skillSubDao.insert(skillSub);
        return skillSub;
    }

    /**
     * 修改数据
     *
     * @param skillSub 实例对象
     * @return 实例对象
     */
    @Override
    public SkillSub update(SkillSub skillSub) {
        this.skillSubDao.update(skillSub);
        return this.queryById(skillSub.getSkillId());
    }

    /**
     * 通过主键删除数据
     *
     * @param skillId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer skillId) {
        return this.skillSubDao.deleteById(skillId) > 0;
    }
}
