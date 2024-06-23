package xyz.game.service.impl;

import xyz.game.entity.EquipId;
import xyz.game.dao.EquipIdDao;
import xyz.game.service.EquipIdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * (EquipId)表服务实现类
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
@Service("equipIdService")
public class EquipIdServiceImpl implements EquipIdService {
    @Resource
    private EquipIdDao equipIdDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    @Override
    public EquipId queryById( ) {
        return this.equipIdDao.queryById();
    }

    /**
     * 分页查询
     *
     * @param equipId 筛选条件
     * @return 查询结果
     */
    @Override
    public List<EquipId> query(EquipId equipId) {
        return this.equipIdDao.query(equipId);
    }

    /**
     * 新增数据
     *
     * @param equipId 实例对象
     * @return 实例对象
     */
    @Override
    public EquipId insert(EquipId equipId) {
        this.equipIdDao.insert(equipId);
        return equipId;
    }

    /**
     * 修改数据
     *
     * @param equipId 实例对象
     * @return 实例对象
     */
    @Override
    public EquipId update(EquipId equipId) {
        this.equipIdDao.update(equipId);
        return this.queryById();
    }

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById( ) {
        return this.equipIdDao.deleteById() > 0;
    }
}
