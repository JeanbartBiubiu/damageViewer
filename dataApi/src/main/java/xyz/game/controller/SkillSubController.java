package xyz.game.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import xyz.game.generaator.ApiController;
import xyz.game.generaator.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import xyz.game.entity.SkillSub;
import xyz.game.service.SkillSubService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (SkillSub)表控制层
 *
 * @author makejava
 * @since 2024-06-15 16:49:21
 */
@RestController
@RequestMapping("skillSub")
public class SkillSubController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SkillSubService skillSubService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param skillSub 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SkillSub> page, SkillSub skillSub) {
        return success(this.skillSubService.page(page, new QueryWrapper<>(skillSub)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.skillSubService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param skillSub 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SkillSub skillSub) {
        return success(this.skillSubService.save(skillSub));
    }

    /**
     * 修改数据
     *
     * @param skillSub 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SkillSub skillSub) {
        return success(this.skillSubService.updateById(skillSub));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.skillSubService.removeByIds(idList));
    }
}

