package xyz.game.controller;

import xyz.game.entity.Individual;
import xyz.game.service.IndividualService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Individual)表控制层
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@RestController
@RequestMapping("individual")
public class IndividualController {
    /**
     * 服务对象
     */
    @Resource
    private IndividualService individualService;

    /**
     * 分页查询
     *
     * @param individual 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Individual>> queryByPage(Individual individual, PageRequest pageRequest) {
        return ResponseEntity.ok(this.individualService.queryByPage(individual, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Individual> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.individualService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param individual 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Individual> add(Individual individual) {
        return ResponseEntity.ok(this.individualService.insert(individual));
    }

    /**
     * 编辑数据
     *
     * @param individual 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Individual> edit(Individual individual) {
        return ResponseEntity.ok(this.individualService.update(individual));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.individualService.deleteById(id));
    }

}

