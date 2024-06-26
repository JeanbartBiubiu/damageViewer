package xyz.game.controller;

import xyz.game.entity.Level;
import xyz.game.service.LevelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.List;

/**
 * 等级定义表(Level)表控制层
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
@RestController
@RequestMapping("level")
public class LevelController {
    /**
     * 服务对象
     */
    @Resource
    private LevelService levelService;

    /**
     * 分页查询
     *
     * @param level 筛选条件
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<List<Level>> query(Level level) {
        return ResponseEntity.ok(this.levelService.query(level));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Level> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.levelService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param level 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Level> add(Level level) {
        return ResponseEntity.ok(this.levelService.insert(level));
    }

    /**
     * 编辑数据
     *
     * @param level 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Level> edit(Level level) {
        return ResponseEntity.ok(this.levelService.update(level));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.levelService.deleteById(id));
    }

}

