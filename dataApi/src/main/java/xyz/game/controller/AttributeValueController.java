package xyz.game.controller;

import xyz.game.entity.AttributeValue;
import xyz.game.service.AttributeValueService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 单位-属性-等级对应数据数值(AttributeValue)表控制层
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@RestController
@RequestMapping("attributeValue")
public class AttributeValueController {
    /**
     * 服务对象
     */
    @Resource
    private AttributeValueService attributeValueService;

    /**
     * 分页查询
     *
     * @param attributeValue 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<AttributeValue>> queryByPage(AttributeValue attributeValue, PageRequest pageRequest) {
        return ResponseEntity.ok(this.attributeValueService.queryByPage(attributeValue, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<AttributeValue> queryById(@PathVariable("id")int  id) {
        return ResponseEntity.ok(this.attributeValueService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param attributeValue 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<AttributeValue> add(AttributeValue attributeValue) {
        return ResponseEntity.ok(this.attributeValueService.insert(attributeValue));
    }

    /**
     * 编辑数据
     *
     * @param attributeValue 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<AttributeValue> edit(AttributeValue attributeValue) {
        return ResponseEntity.ok(this.attributeValueService.update(attributeValue));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(int id) {
        return ResponseEntity.ok(this.attributeValueService.deleteById(id));
    }

}

