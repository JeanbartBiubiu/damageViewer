package xyz.game.service;

import xyz.game.entity.AttributeValue;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 单位-属性-等级对应数据数值(AttributeValue)表服务接口
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
public interface AttributeValueService {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    AttributeValue queryById(int id);

    /**
     * 分页查询
     *
     * @param attributeValue 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<AttributeValue> queryByPage(AttributeValue attributeValue, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param attributeValue 实例对象
     * @return 实例对象
     */
    AttributeValue insert(AttributeValue attributeValue);

    /**
     * 修改数据
     *
     * @param attributeValue 实例对象
     * @return 实例对象
     */
    AttributeValue update(AttributeValue attributeValue);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById( int id);

}
