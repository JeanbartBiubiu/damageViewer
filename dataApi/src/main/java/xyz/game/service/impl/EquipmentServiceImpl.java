package xyz.game.service.impl;

import xyz.game.entity.Equipment;
import xyz.game.dao.EquipmentDao;
import xyz.game.service.EquipmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * 装备表(buff等状态效果也定义为装备)(Equipment)表服务实现类
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
@Service("equipmentService")
public class EquipmentServiceImpl implements EquipmentService {
    @Resource
    private EquipmentDao equipmentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param equipId 主键
     * @return 实例对象
     */
    @Override
    public Equipment queryById(Integer equipId) {
        return this.equipmentDao.queryById(equipId);
    }

    /**
     * 分页查询
     *
     * @param equipment 筛选条件
     * @return 查询结果
     */
    @Override
    public List<Equipment> query(Equipment equipment) {
        return this.equipmentDao.query(equipment);
    }

    /**
     * 新增数据
     *
     * @param equipment 实例对象
     * @return 实例对象
     */
    @Override
    public Equipment insert(Equipment equipment) {
        this.equipmentDao.insert(equipment);
        return equipment;
    }

    /**
     * 修改数据
     *
     * @param equipment 实例对象
     * @return 实例对象
     */
    @Override
    public Equipment update(Equipment equipment) {
        this.equipmentDao.update(equipment);
        return this.queryById(equipment.getEquipId());
    }

    /**
     * 通过主键删除数据
     *
     * @param equipId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer equipId) {
        return this.equipmentDao.deleteById(equipId) > 0;
    }
}
