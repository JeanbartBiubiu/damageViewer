package xyz.game.dao;

import xyz.game.entity.Level;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 等级定义表(Level)表数据库访问层
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
public interface LevelDao {

    /**
     * 通过ID查询单条数据
     *
     * @param levelId 主键
     * @return 实例对象
     */
    Level queryById(Integer levelId);

    /**
     * 查询指定行数据
     *
     * @param level 查询条件
     * @return 对象列表
     */
    List<Level> query(Level level);

    /**
     * 统计总行数
     *
     * @param level 查询条件
     * @return 总行数
     */
    long count(Level level);

    /**
     * 新增数据
     *
     * @param level 实例对象
     * @return 影响行数
     */
    int insert(Level level);

    Integer maxId();

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Level> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Level> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Level> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Level> entities);

    /**
     * 修改数据
     *
     * @param level 实例对象
     * @return 影响行数
     */
    int update(Level level);

    /**
     * 通过主键删除数据
     *
     * @param levelId 主键
     * @return 影响行数
     */
    int deleteById(Integer levelId);

}

