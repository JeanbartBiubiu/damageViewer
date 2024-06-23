package xyz.game.service;

import xyz.game.entity.EquipId;

import java.util.List;

/**
 * (EquipId)表服务接口
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
public interface EquipIdService {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    EquipId queryById( );

    /**
     * 分页查询
     *
     * @param equipId 筛选条件
     * @return 查询结果
     */
    List<EquipId> query(EquipId equipId);

    /**
     * 新增数据
     *
     * @param equipId 实例对象
     * @return 实例对象
     */
    EquipId insert(EquipId equipId);

    /**
     * 修改数据
     *
     * @param equipId 实例对象
     * @return 实例对象
     */
    EquipId update(EquipId equipId);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById( );

}
