package xyz.game.service;

import xyz.game.entity.EquipmentName;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (EquipmentName)表服务接口
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
public interface EquipmentNameService {

    /**
     * 通过ID查询单条数据
     *
     * @param equipId 主键
     * @return 实例对象
     */
    EquipmentName queryById(Integer equipId);

    /**
     * 分页查询
     *
     * @param equipmentName 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<EquipmentName> queryByPage(EquipmentName equipmentName, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param equipmentName 实例对象
     * @return 实例对象
     */
    EquipmentName insert(EquipmentName equipmentName);

    /**
     * 修改数据
     *
     * @param equipmentName 实例对象
     * @return 实例对象
     */
    EquipmentName update(EquipmentName equipmentName);

    /**
     * 通过主键删除数据
     *
     * @param equipId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer equipId);

}
