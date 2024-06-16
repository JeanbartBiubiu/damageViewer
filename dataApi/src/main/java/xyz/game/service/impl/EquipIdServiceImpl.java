package xyz.game.service.impl;

import xyz.game.entity.EquipId;
import xyz.game.dao.EquipIdDao;
import xyz.game.service.EquipIdService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (EquipId)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
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
    public EquipId queryById(int id ) {
        return this.equipIdDao.queryById();
    }

    /**
     * 分页查询
     *
     * @param equipId 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<EquipId> queryByPage(EquipId equipId, PageRequest pageRequest) {
        long total = this.equipIdDao.count(equipId);
        return new PageImpl<>(this.equipIdDao.queryAllByLimit(equipId, pageRequest), pageRequest, total);
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
        return this.queryById(equipId.getEquipId());
    }

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(int id ) {
        return this.equipIdDao.deleteById() > 0;
    }
}
