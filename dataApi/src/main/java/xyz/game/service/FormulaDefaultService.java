package xyz.game.service;

import xyz.game.entity.FormulaDefault;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (FormulaDefault)表服务接口
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
public interface FormulaDefaultService {

    /**
     * 通过ID查询单条数据
     *
     * @param formulaId 主键
     * @return 实例对象
     */
    FormulaDefault queryById(Integer formulaId);

    /**
     * 分页查询
     *
     * @param formulaDefault 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<FormulaDefault> queryByPage(FormulaDefault formulaDefault, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param formulaDefault 实例对象
     * @return 实例对象
     */
    FormulaDefault insert(FormulaDefault formulaDefault);

    /**
     * 修改数据
     *
     * @param formulaDefault 实例对象
     * @return 实例对象
     */
    FormulaDefault update(FormulaDefault formulaDefault);

    /**
     * 通过主键删除数据
     *
     * @param formulaId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer formulaId);

}
