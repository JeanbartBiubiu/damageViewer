package xyz.game.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import xyz.game.generaator.ApiController;
import xyz.game.generaator.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import xyz.game.entity.FormulaDefault;
import xyz.game.service.FormulaDefaultService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (FormulaDefault)表控制层
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@RestController
@RequestMapping("formulaDefault")
public class FormulaDefaultController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private FormulaDefaultService formulaDefaultService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param formulaDefault 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<FormulaDefault> page, FormulaDefault formulaDefault) {
        return success(this.formulaDefaultService.page(page, new QueryWrapper<>(formulaDefault)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.formulaDefaultService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param formulaDefault 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody FormulaDefault formulaDefault) {
        return success(this.formulaDefaultService.save(formulaDefault));
    }

    /**
     * 修改数据
     *
     * @param formulaDefault 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody FormulaDefault formulaDefault) {
        return success(this.formulaDefaultService.updateById(formulaDefault));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.formulaDefaultService.removeByIds(idList));
    }
}

