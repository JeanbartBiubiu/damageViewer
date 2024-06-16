package xyz.game.controller;

import xyz.game.entity.FormulaImpl;
import xyz.game.service.FormulaImplService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (FormulaImpl)表控制层
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@RestController
@RequestMapping("formulaImpl")
public class FormulaImplController {
    /**
     * 服务对象
     */
    @Resource
    private FormulaImplService formulaImplService;

    /**
     * 分页查询
     *
     * @param formulaImpl 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<FormulaImpl>> queryByPage(FormulaImpl formulaImpl, PageRequest pageRequest) {
        return ResponseEntity.ok(this.formulaImplService.queryByPage(formulaImpl, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<FormulaImpl> queryById(@PathVariable("id") int id) {
        return ResponseEntity.ok(this.formulaImplService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param formulaImpl 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<FormulaImpl> add(FormulaImpl formulaImpl) {
        return ResponseEntity.ok(this.formulaImplService.insert(formulaImpl));
    }

    /**
     * 编辑数据
     *
     * @param formulaImpl 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<FormulaImpl> edit(FormulaImpl formulaImpl) {
        return ResponseEntity.ok(this.formulaImplService.update(formulaImpl));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(int id) {
        return ResponseEntity.ok(this.formulaImplService.deleteById(id));
    }

}

