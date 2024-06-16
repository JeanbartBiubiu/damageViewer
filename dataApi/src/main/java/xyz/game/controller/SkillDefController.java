package xyz.game.controller;

import xyz.game.entity.SkillDef;
import xyz.game.service.SkillDefService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 技能定义表(SkillDef)表控制层
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@RestController
@RequestMapping("skillDef")
public class SkillDefController {
    /**
     * 服务对象
     */
    @Resource
    private SkillDefService skillDefService;

    /**
     * 分页查询
     *
     * @param skillDef 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<SkillDef>> queryByPage(SkillDef skillDef, PageRequest pageRequest) {
        return ResponseEntity.ok(this.skillDefService.queryByPage(skillDef, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<SkillDef> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.skillDefService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param skillDef 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<SkillDef> add(SkillDef skillDef) {
        return ResponseEntity.ok(this.skillDefService.insert(skillDef));
    }

    /**
     * 编辑数据
     *
     * @param skillDef 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<SkillDef> edit(SkillDef skillDef) {
        return ResponseEntity.ok(this.skillDefService.update(skillDef));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.skillDefService.deleteById(id));
    }

}

