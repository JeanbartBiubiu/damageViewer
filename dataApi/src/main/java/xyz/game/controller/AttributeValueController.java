package xyz.game.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import xyz.game.generaator.ApiController;
import xyz.game.generaator.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import xyz.game.entity.AttributeValue;
import xyz.game.service.AttributeValueService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 单位-属性-等级对应数据数值(AttributeValue)表控制层
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@RestController
@RequestMapping("attributeValue")
public class AttributeValueController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private AttributeValueService attributeValueService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param attributeValue 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<AttributeValue> page, AttributeValue attributeValue) {
        return success(this.attributeValueService.page(page, new QueryWrapper<>(attributeValue)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.attributeValueService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param attributeValue 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody AttributeValue attributeValue) {
        return success(this.attributeValueService.save(attributeValue));
    }

    /**
     * 修改数据
     *
     * @param attributeValue 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody AttributeValue attributeValue) {
        return success(this.attributeValueService.updateById(attributeValue));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.attributeValueService.removeByIds(idList));
    }
}

