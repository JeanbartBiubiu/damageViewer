package xyz.game.service;

import xyz.game.entity.Individual;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Individual)表服务接口
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
public interface IndividualService {

    /**
     * 通过ID查询单条数据
     *
     * @param indivId 主键
     * @return 实例对象
     */
    Individual queryById(Integer indivId);

    /**
     * 分页查询
     *
     * @param individual 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Individual> queryByPage(Individual individual, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param individual 实例对象
     * @return 实例对象
     */
    Individual insert(Individual individual);

    /**
     * 修改数据
     *
     * @param individual 实例对象
     * @return 实例对象
     */
    Individual update(Individual individual);

    /**
     * 通过主键删除数据
     *
     * @param indivId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer indivId);

}
