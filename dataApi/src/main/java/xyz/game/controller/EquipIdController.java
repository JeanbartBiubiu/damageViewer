package xyz.game.controller;

import xyz.game.entity.EquipId;
import xyz.game.service.EquipIdService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (EquipId)表控制层
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
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
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<EquipId>> queryByPage(EquipId equipId, PageRequest pageRequest) {
        return ResponseEntity.ok(this.equipIdService.queryByPage(equipId, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<EquipId> queryById(@PathVariable("id") int id) {
        return ResponseEntity.ok(this.equipIdService.queryById(id));
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
    public ResponseEntity<Boolean> deleteById(int id) {
        return ResponseEntity.ok(this.equipIdService.deleteById(id));
    }

}

