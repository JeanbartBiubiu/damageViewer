package xyz.game.controller;

import xyz.game.entity.EquipId;
import xyz.game.service.EquipIdService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.List;

/**
 * (EquipId)表控制层
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
@RestController
@RequestMapping("equipId")
public class EquipIdController {
    /**
     * 服务对象
     */
    @Resource
    private EquipIdService equipIdService;

    /**
     * 分页查询
     *
     * @param equipId 筛选条件
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<List<EquipId>> query(EquipId equipId) {
        return ResponseEntity.ok(this.equipIdService.query(equipId));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<EquipId> queryById(@PathVariable("id")  int id) {
        return ResponseEntity.ok(this.equipIdService.queryById());
    }

    /**
     * 新增数据
     *
     * @param equipId 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<EquipId> add(EquipId equipId) {
        return ResponseEntity.ok(this.equipIdService.insert(equipId));
    }

    /**
     * 编辑数据
     *
     * @param equipId 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<EquipId> edit(EquipId equipId) {
        return ResponseEntity.ok(this.equipIdService.update(equipId));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById( int id) {
        return ResponseEntity.ok(this.equipIdService.deleteById());
    }

}

