package xyz.game.controller;

import xyz.game.entity.SkillSub;
import xyz.game.service.SkillSubService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.List;

/**
 * (SkillSub)表控制层
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
@RestController
@RequestMapping("skillSub")
public class SkillSubController {
    /**
     * 服务对象
     */
    @Resource
    private SkillSubService skillSubService;

    /**
     * 分页查询
     *
     * @param skillSub 筛选条件
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<List<SkillSub>> query(SkillSub skillSub) {
        return ResponseEntity.ok(this.skillSubService.query(skillSub));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SkillSub> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.skillSubService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param skillSub 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SkillSub> add(SkillSub skillSub) {
        return ResponseEntity.ok(this.skillSubService.insert(skillSub));
    }

    /**
     * 编辑数据
     *
     * @param skillSub 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SkillSub> edit(SkillSub skillSub) {
        return ResponseEntity.ok(this.skillSubService.update(skillSub));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.skillSubService.deleteById(id));
    }

}

