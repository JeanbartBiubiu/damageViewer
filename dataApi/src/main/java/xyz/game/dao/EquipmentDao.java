package xyz.game.dao;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import xyz.game.entity.Equipment;

/**
 * 装备表(buff等状态效果也定义为装备)(Equipment)表数据库访问层
 *
 * @author makejava
 * @since 2024-06-15 16:49:21
 */
public interface EquipmentDao extends BaseMapper<Equipment> {

/**
* 批量新增数据（MyBatis原生foreach方法）
*
* @param entities List<Equipment> 实例对象列表
* @return 影响行数
*/
int insertBatch(@Param("entities") List<Equipment> entities);

/**
* 批量新增或按主键更新数据（MyBatis原生foreach方法）
*
* @param entities List<Equipment> 实例对象列表
* @return 影响行数
* @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
*/
int insertOrUpdateBatch(@Param("entities") List<Equipment> entities);

}

