package xyz.game.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import xyz.game.entity.Attribute;
import xyz.game.generaator.ApiController;
import xyz.game.generaator.R;
import xyz.game.service.AttributeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 属性表(Attribute)表控制层
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@RestController
@RequestMapping("attribute")
public class AttributeController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private AttributeService attributeService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param attribute 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Attribute> page, Attribute attribute) {
        return success(this.attributeService.page(page, new QueryWrapper<>(attribute)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.attributeService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param attribute 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Attribute attribute) {
        return success(this.attributeService.save(attribute));
    }

    /**
     * 修改数据
     *
     * @param attribute 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Attribute attribute) {
        return success(this.attributeService.updateById(attribute));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.attributeService.removeByIds(idList));
    }
}

