package xyz.game.dao;

import xyz.game.entity.SkillSub;
import org.apache.ibatis.annotations.Param;
import xyz.game.entity.custom.SkillReq;

import java.util.List;

/**
 * (SkillSub)表数据库访问层
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
public interface SkillSubDao {

    int maxId();

    /**
     * 通过ID查询单条数据
     *
     * @param skillId 主键
     * @return 实例对象
     */
    SkillSub queryById(Integer skillId);

    /**
     * 查询指定行数据
     *
     * @param skillSub 查询条件
     * @return 对象列表
     */
    List<SkillReq> query(SkillReq skill);

    /**
     * 统计总行数
     *
     * @param skillSub 查询条件
     * @return 总行数
     */
    long count(SkillSub skillSub);

    /**
     * 新增数据
     *
     * @param skillSub 实例对象
     * @return 影响行数
     */
    int insert(SkillSub skillSub);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SkillSub> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SkillSub> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SkillSub> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SkillSub> entities);

    /**
     * 修改数据
     *
     * @param skillSub 实例对象
     * @return 影响行数
     */
    int update(SkillSub skillSub);

    /**
     * 通过主键删除数据
     *
     * @param skillId 主键
     * @return 影响行数
     */
    int deleteById(Integer skillId);

}

