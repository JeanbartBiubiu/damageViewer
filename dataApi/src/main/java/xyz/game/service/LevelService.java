package xyz.game.service;

import xyz.game.entity.Level;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 等级定义表(Level)表服务接口
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
public interface LevelService {

    /**
     * 通过ID查询单条数据
     *
     * @param levelId 主键
     * @return 实例对象
     */
    Level queryById(Integer levelId);

    /**
     * 分页查询
     *
     * @param level 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Level> queryByPage(Level level, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param level 实例对象
     * @return 实例对象
     */
    Level insert(Level level);

    /**
     * 修改数据
     *
     * @param level 实例对象
     * @return 实例对象
     */
    Level update(Level level);

    /**
     * 通过主键删除数据
     *
     * @param levelId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer levelId);

}
