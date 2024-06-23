package xyz.game.controller;

import xyz.game.entity.ComputingLifeCycle;
import xyz.game.service.ComputingLifeCycleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.List;

/**
 * (ComputingLifeCycle)表控制层
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
@RestController
@RequestMapping("computingLifeCycle")
public class ComputingLifeCycleController {
    /**
     * 服务对象
     */
    @Resource
    private ComputingLifeCycleService computingLifeCycleService;

    /**
     * 分页查询
     *
     * @param computingLifeCycle 筛选条件
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<List<ComputingLifeCycle>> query(ComputingLifeCycle computingLifeCycle) {
        return ResponseEntity.ok(this.computingLifeCycleService.query(computingLifeCycle));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ComputingLifeCycle> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.computingLifeCycleService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param computingLifeCycle 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ComputingLifeCycle> add(ComputingLifeCycle computingLifeCycle) {
        return ResponseEntity.ok(this.computingLifeCycleService.insert(computingLifeCycle));
    }

    /**
     * 编辑数据
     *
     * @param computingLifeCycle 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ComputingLifeCycle> edit(ComputingLifeCycle computingLifeCycle) {
        return ResponseEntity.ok(this.computingLifeCycleService.update(computingLifeCycle));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.computingLifeCycleService.deleteById(id));
    }

}

