package xyz.game.service;

import xyz.game.entity.EquipId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (EquipId)表服务接口
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
public interface EquipIdService {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    EquipId queryById(int id );

    /**
     * 分页查询
     *
     * @param equipId 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<EquipId> queryByPage(EquipId equipId, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param equipId 实例对象
     * @return 实例对象
     */
    EquipId insert(EquipId equipId);

    /**
     * 修改数据
     *
     * @param equipId 实例对象
     * @return 实例对象
     */
    EquipId update(EquipId equipId);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById(int id );

}
