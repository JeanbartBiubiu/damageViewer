package xyz.game.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import xyz.game.generaator.ApiController;
import xyz.game.generaator.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import xyz.game.entity.EquipmentName;
import xyz.game.service.EquipmentNameService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (EquipmentName)表控制层
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@RestController
@RequestMapping("equipmentName")
public class EquipmentNameController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private EquipmentNameService equipmentNameService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param equipmentName 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<EquipmentName> page, EquipmentName equipmentName) {
        return success(this.equipmentNameService.page(page, new QueryWrapper<>(equipmentName)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.equipmentNameService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param equipmentName 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody EquipmentName equipmentName) {
        return success(this.equipmentNameService.save(equipmentName));
    }

    /**
     * 修改数据
     *
     * @param equipmentName 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody EquipmentName equipmentName) {
        return success(this.equipmentNameService.updateById(equipmentName));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.equipmentNameService.removeByIds(idList));
    }
}

