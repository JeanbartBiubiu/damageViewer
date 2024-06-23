package xyz.game.controller;

import xyz.game.entity.EquipmentName;
import xyz.game.service.EquipmentNameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.List;

/**
 * (EquipmentName)表控制层
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
@RestController
@RequestMapping("equipmentName")
public class EquipmentNameController {
    /**
     * 服务对象
     */
    @Resource
    private EquipmentNameService equipmentNameService;

    /**
     * 分页查询
     *
     * @param equipmentName 筛选条件
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<List<EquipmentName>> query(EquipmentName equipmentName) {
        return ResponseEntity.ok(this.equipmentNameService.query(equipmentName));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<EquipmentName> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.equipmentNameService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param equipmentName 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<EquipmentName> add(EquipmentName equipmentName) {
        return ResponseEntity.ok(this.equipmentNameService.insert(equipmentName));
    }

    /**
     * 编辑数据
     *
     * @param equipmentName 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<EquipmentName> edit(EquipmentName equipmentName) {
        return ResponseEntity.ok(this.equipmentNameService.update(equipmentName));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.equipmentNameService.deleteById(id));
    }

}

