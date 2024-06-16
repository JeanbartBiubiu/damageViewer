package xyz.game.service;

import xyz.game.entity.Attribute;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 属性表(Attribute)表服务接口
 *
 * @author makejava
 * @since 2024-06-15 19:17:12
 */
public interface AttributeService {

    /**
     * 通过ID查询单条数据
     *
     * @param attributeId 主键
     * @return 实例对象
     */
    Attribute queryById(Integer attributeId);

    /**
     * 分页查询
     *
     * @param attribute 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Attribute> queryByPage(Attribute attribute, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param attribute 实例对象
     * @return 实例对象
     */
    Attribute insert(Attribute attribute);

    /**
     * 修改数据
     *
     * @param attribute 实例对象
     * @return 实例对象
     */
    Attribute update(Attribute attribute);

    /**
     * 通过主键删除数据
     *
     * @param attributeId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer attributeId);

}
