package xyz.game.service.impl;

import xyz.game.entity.EquipmentName;
import xyz.game.dao.EquipmentNameDao;
import xyz.game.service.EquipmentNameService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (EquipmentName)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@Service("equipmentNameService")
public class EquipmentNameServiceImpl implements EquipmentNameService {
    @Resource
    private EquipmentNameDao equipmentNameDao;

    /**
     * 通过ID查询单条数据
     *
     * @param equipId 主键
     * @return 实例对象
     */
    @Override
    public EquipmentName queryById(Integer equipId) {
        return this.equipmentNameDao.queryById(equipId);
    }

    /**
     * 分页查询
     *
     * @param equipmentName 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<EquipmentName> queryByPage(EquipmentName equipmentName, PageRequest pageRequest) {
        long total = this.equipmentNameDao.count(equipmentName);
        return new PageImpl<>(this.equipmentNameDao.queryAllByLimit(equipmentName, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param equipmentName 实例对象
     * @return 实例对象
     */
    @Override
    public EquipmentName insert(EquipmentName equipmentName) {
        this.equipmentNameDao.insert(equipmentName);
        return equipmentName;
    }

    /**
     * 修改数据
     *
     * @param equipmentName 实例对象
     * @return 实例对象
     */
    @Override
    public EquipmentName update(EquipmentName equipmentName) {
        this.equipmentNameDao.update(equipmentName);
        return this.queryById(equipmentName.getEquipId());
    }

    /**
     * 通过主键删除数据
     *
     * @param equipId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer equipId) {
        return this.equipmentNameDao.deleteById(equipId) > 0;
    }
}
