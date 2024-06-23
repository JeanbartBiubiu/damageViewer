package xyz.game.controller;

import xyz.game.entity.IndivName;
import xyz.game.service.IndivNameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.List;

/**
 * (IndivName)表控制层
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
@RestController
@RequestMapping("indivName")
public class IndivNameController {
    /**
     * 服务对象
     */
    @Resource
    private IndivNameService indivNameService;

    /**
     * 分页查询
     *
     * @param indivName 筛选条件
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<List<IndivName>> query(IndivName indivName) {
        return ResponseEntity.ok(this.indivNameService.query(indivName));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<IndivName> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.indivNameService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param indivName 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<IndivName> add(IndivName indivName) {
        return ResponseEntity.ok(this.indivNameService.insert(indivName));
    }

    /**
     * 编辑数据
     *
     * @param indivName 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<IndivName> edit(IndivName indivName) {
        return ResponseEntity.ok(this.indivNameService.update(indivName));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.indivNameService.deleteById(id));
    }

}

