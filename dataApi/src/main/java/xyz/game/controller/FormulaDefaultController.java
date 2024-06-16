package xyz.game.controller;

import xyz.game.entity.FormulaDefault;
import xyz.game.service.FormulaDefaultService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (FormulaDefault)表控制层
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@RestController
@RequestMapping("formulaDefault")
public class FormulaDefaultController {
    /**
     * 服务对象
     */
    @Resource
    private FormulaDefaultService formulaDefaultService;

    /**
     * 分页查询
     *
     * @param formulaDefault 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<FormulaDefault>> queryByPage(FormulaDefault formulaDefault, PageRequest pageRequest) {
        return ResponseEntity.ok(this.formulaDefaultService.queryByPage(formulaDefault, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<FormulaDefault> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.formulaDefaultService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param formulaDefault 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<FormulaDefault> add(FormulaDefault formulaDefault) {
        return ResponseEntity.ok(this.formulaDefaultService.insert(formulaDefault));
    }

    /**
     * 编辑数据
     *
     * @param formulaDefault 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<FormulaDefault> edit(FormulaDefault formulaDefault) {
        return ResponseEntity.ok(this.formulaDefaultService.update(formulaDefault));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.formulaDefaultService.deleteById(id));
    }

}

