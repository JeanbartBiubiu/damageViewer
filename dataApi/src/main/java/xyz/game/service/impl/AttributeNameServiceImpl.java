package xyz.game.service.impl;

import xyz.game.entity.AttributeName;
import xyz.game.dao.AttributeNameDao;
import xyz.game.service.AttributeNameService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 属性名称表(AttributeName)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@Service("attributeNameService")
public class AttributeNameServiceImpl implements AttributeNameService {
    @Resource
    private AttributeNameDao attributeNameDao;

    /**
     * 通过ID查询单条数据
     *
     * @param attributeId 主键
     * @return 实例对象
     */
    @Override
    public AttributeName queryById(Integer attributeId) {
        return this.attributeNameDao.queryById(attributeId);
    }

    /**
     * 分页查询
     *
     * @param attributeName 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<AttributeName> queryByPage(AttributeName attributeName, PageRequest pageRequest) {
        long total = this.attributeNameDao.count(attributeName);
        return new PageImpl<>(this.attributeNameDao.queryAllByLimit(attributeName, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param attributeName 实例对象
     * @return 实例对象
     */
    @Override
    public AttributeName insert(AttributeName attributeName) {
        this.attributeNameDao.insert(attributeName);
        return attributeName;
    }

    /**
     * 修改数据
     *
     * @param attributeName 实例对象
     * @return 实例对象
     */
    @Override
    public AttributeName update(AttributeName attributeName) {
        this.attributeNameDao.update(attributeName);
        return this.queryById(attributeName.getAttributeId());
    }

    /**
     * 通过主键删除数据
     *
     * @param attributeId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer attributeId) {
        return this.attributeNameDao.deleteById(attributeId) > 0;
    }
}
