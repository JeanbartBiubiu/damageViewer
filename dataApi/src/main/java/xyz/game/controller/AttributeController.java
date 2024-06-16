package xyz.game.controller;

import xyz.game.entity.Attribute;
import xyz.game.service.AttributeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 属性表(Attribute)表控制层
 *
 * @author makejava
 * @since 2024-06-15 19:17:12
 */
@RestController
@RequestMapping("attribute")
public class AttributeController {
    /**
     * 服务对象
     */
    @Resource
    private AttributeService attributeService;

    /**
     * 分页查询
     *
     * @param attribute 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Attribute>> queryByPage(Attribute attribute, PageRequest pageRequest) {
        return ResponseEntity.ok(this.attributeService.queryByPage(attribute, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Attribute> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.attributeService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param attribute 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Attribute> add(Attribute attribute) {
        return ResponseEntity.ok(this.attributeService.insert(attribute));
    }

    /**
     * 编辑数据
     *
     * @param attribute 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Attribute> edit(Attribute attribute) {
        return ResponseEntity.ok(this.attributeService.update(attribute));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.attributeService.deleteById(id));
    }

}

