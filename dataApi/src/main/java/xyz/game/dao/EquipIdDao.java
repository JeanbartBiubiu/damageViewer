package xyz.game.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.game.entity.EquipId;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (EquipId)表数据库访问层
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@Mapper
public interface EquipIdDao {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    EquipId queryById( );

    /**
     * 查询指定行数据
     *
     * @param equipId 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<EquipId> queryAllByLimit(EquipId equipId, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param equipId 查询条件
     * @return 总行数
     */
    long count(EquipId equipId);

    /**
     * 新增数据
     *
     * @param equipId 实例对象
     * @return 影响行数
     */
    int insert(EquipId equipId);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<EquipId> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<EquipId> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<EquipId> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<EquipId> entities);

    /**
     * 修改数据
     *
     * @param equipId 实例对象
     * @return 影响行数
     */
    int update(EquipId equipId);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 影响行数
     */
    int deleteById( );

}

