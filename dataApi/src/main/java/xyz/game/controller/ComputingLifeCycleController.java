package xyz.game.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import xyz.game.generaator.ApiController;
import xyz.game.generaator.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import xyz.game.entity.ComputingLifeCycle;
import xyz.game.service.ComputingLifeCycleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (ComputingLifeCycle)表控制层
 *
 * @author makejava
 * @since 2024-06-15 16:49:21
 */
@RestController
@RequestMapping("computingLifeCycle")
public class ComputingLifeCycleController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ComputingLifeCycleService computingLifeCycleService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param computingLifeCycle 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<ComputingLifeCycle> page, ComputingLifeCycle computingLifeCycle) {
        return success(this.computingLifeCycleService.page(page, new QueryWrapper<>(computingLifeCycle)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.computingLifeCycleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param computingLifeCycle 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody ComputingLifeCycle computingLifeCycle) {
        return success(this.computingLifeCycleService.save(computingLifeCycle));
    }

    /**
     * 修改数据
     *
     * @param computingLifeCycle 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody ComputingLifeCycle computingLifeCycle) {
        return success(this.computingLifeCycleService.updateById(computingLifeCycle));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.computingLifeCycleService.removeByIds(idList));
    }
}

