package xyz.game.service.impl;

import xyz.game.entity.Attribute;
import xyz.game.dao.AttributeDao;
import xyz.game.service.AttributeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * 属性表(Attribute)表服务实现类
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
@Service("attributeService")
public class AttributeServiceImpl implements AttributeService {
    @Resource
    private AttributeDao attributeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param attributeId 主键
     * @return 实例对象
     */
    @Override
    public Attribute queryById(Integer attributeId) {
        return this.attributeDao.queryById(attributeId);
    }

    /**
     * 分页查询
     *
     * @param attribute 筛选条件
     * @return 查询结果
     */
    @Override
    public List<Attribute> query(Attribute attribute) {
        return this.attributeDao.query(attribute);
    }

    /**
     * 新增数据
     *
     * @param attribute 实例对象
     * @return 实例对象
     */
    @Override
    public Attribute insert(Attribute attribute) {
        this.attributeDao.insert(attribute);
        return attribute;
    }

    /**
     * 修改数据
     *
     * @param attribute 实例对象
     * @return 实例对象
     */
    @Override
    public Attribute update(Attribute attribute) {
        this.attributeDao.update(attribute);
        return this.queryById(attribute.getAttributeId());
    }

    /**
     * 通过主键删除数据
     *
     * @param attributeId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer attributeId) {
        return this.attributeDao.deleteById(attributeId) > 0;
    }
}
