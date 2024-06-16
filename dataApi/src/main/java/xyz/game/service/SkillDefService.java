package xyz.game.service;

import xyz.game.entity.SkillDef;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 技能定义表(SkillDef)表服务接口
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
public interface SkillDefService {

    /**
     * 通过ID查询单条数据
     *
     * @param skillId 主键
     * @return 实例对象
     */
    SkillDef queryById(Integer skillId);

    /**
     * 分页查询
     *
     * @param skillDef 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SkillDef> queryByPage(SkillDef skillDef, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param skillDef 实例对象
     * @return 实例对象
     */
    SkillDef insert(SkillDef skillDef);

    /**
     * 修改数据
     *
     * @param skillDef 实例对象
     * @return 实例对象
     */
    SkillDef update(SkillDef skillDef);

    /**
     * 通过主键删除数据
     *
     * @param skillId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer skillId);

}
