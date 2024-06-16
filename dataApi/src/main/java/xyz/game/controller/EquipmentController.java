package xyz.game.controller;

import xyz.game.entity.Equipment;
import xyz.game.service.EquipmentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 装备表(buff等状态效果也定义为装备)(Equipment)表控制层
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@RestController
@RequestMapping("equipment")
public class EquipmentController {
    /**
     * 服务对象
     */
    @Resource
    private EquipmentService equipmentService;

    /**
     * 分页查询
     *
     * @param equipment 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Equipment>> queryByPage(Equipment equipment, PageRequest pageRequest) {
        return ResponseEntity.ok(this.equipmentService.queryByPage(equipment, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Equipment> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.equipmentService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param equipment 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Equipment> add(Equipment equipment) {
        return ResponseEntity.ok(this.equipmentService.insert(equipment));
    }

    /**
     * 编辑数据
     *
     * @param equipment 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Equipment> edit(Equipment equipment) {
        return ResponseEntity.ok(this.equipmentService.update(equipment));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.equipmentService.deleteById(id));
    }

}

