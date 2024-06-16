package xyz.game.service;

import xyz.game.entity.IndivName;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (IndivName)表服务接口
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
public interface IndivNameService {

    /**
     * 通过ID查询单条数据
     *
     * @param indivId 主键
     * @return 实例对象
     */
    IndivName queryById(Integer indivId);

    /**
     * 分页查询
     *
     * @param indivName 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<IndivName> queryByPage(IndivName indivName, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param indivName 实例对象
     * @return 实例对象
     */
    IndivName insert(IndivName indivName);

    /**
     * 修改数据
     *
     * @param indivName 实例对象
     * @return 实例对象
     */
    IndivName update(IndivName indivName);

    /**
     * 通过主键删除数据
     *
     * @param indivId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer indivId);

}
