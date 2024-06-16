package xyz.game.service.impl;

import xyz.game.entity.AttributeValue;
import xyz.game.dao.AttributeValueDao;
import xyz.game.service.AttributeValueService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 单位-属性-等级对应数据数值(AttributeValue)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@Service("attributeValueService")
public class AttributeValueServiceImpl implements AttributeValueService {
    @Resource
    private AttributeValueDao attributeValueDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    @Override
    public AttributeValue queryById(int id) {
        return this.attributeValueDao.queryById();
    }

    /**
     * 分页查询
     *
     * @param attributeValue 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<AttributeValue> queryByPage(AttributeValue attributeValue, PageRequest pageRequest) {
        long total = this.attributeValueDao.count(attributeValue);
        return new PageImpl<>(this.attributeValueDao.queryAllByLimit(attributeValue, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param attributeValue 实例对象
     * @return 实例对象
     */
    @Override
    public AttributeValue insert(AttributeValue attributeValue) {
        this.attributeValueDao.insert(attributeValue);
        return attributeValue;
    }

    /**
     * 修改数据
     *
     * @param attributeValue 实例对象
     * @return 实例对象
     */
    @Override
    public AttributeValue update(AttributeValue attributeValue) {
        this.attributeValueDao.update(attributeValue);
        return this.queryById(attributeValue.getAttributeId());
    }

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(int id ) {
        return this.attributeValueDao.deleteById() > 0;
    }
}
