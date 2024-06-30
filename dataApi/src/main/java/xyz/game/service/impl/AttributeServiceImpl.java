package xyz.game.service.impl;

import org.springframework.beans.BeanUtils;
import xyz.game.dao.AttributeNameDao;
import xyz.game.entity.Attribute;
import xyz.game.dao.AttributeDao;
import xyz.game.entity.AttributeName;
import xyz.game.entity.custom.AttributeReq;
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
    @Resource
    private AttributeNameDao attributeNameDao;

    /**
     * 通过ID查询单条数据
     *
     * @param attributeId 主键
     * @return 实例对象
     */
    @Override
    public AttributeReq queryById(Integer attributeId) {
        Attribute attribute = this.attributeDao.queryById(attributeId);
        AttributeName attributeName = this.attributeNameDao.queryById(attributeId);
        AttributeReq attributeReq = new AttributeReq();
        BeanUtils.copyProperties(attribute,attributeReq);
        BeanUtils.copyProperties(attributeName,attributeReq);
        return attributeReq;
    }

    /**
     * 分页查询
     *
     * @param attribute 筛选条件
     * @return 查询结果
     */
    @Override
    public List<AttributeReq> query(AttributeReq attribute) {
        return this.attributeDao.queryJoin(attribute);
    }

    /**
     * 新增数据
     *
     * @param attribute 实例对象
     * @return 实例对象
     */
    @Override
    public AttributeReq insert(AttributeReq attribute) {
        Attribute a1 = new Attribute();
        AttributeName a2 = new AttributeName();
        BeanUtils.copyProperties(attribute,a1);
        BeanUtils.copyProperties(attribute,a2);
        this.attributeDao.insert(a1);
        this.attributeNameDao.insert(a2);
        return attribute;
    }

    /**
     * 修改数据
     *
     * @param attribute 实例对象
     * @return 实例对象
     */
    @Override
    public AttributeReq update(AttributeReq attribute) {
        Attribute a1 = new Attribute();
        AttributeName a2 = new AttributeName();
        BeanUtils.copyProperties(attribute,a1);
        BeanUtils.copyProperties(attribute,a2);
        this.attributeDao.update(a1);
        this.attributeNameDao.update(a2);
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
