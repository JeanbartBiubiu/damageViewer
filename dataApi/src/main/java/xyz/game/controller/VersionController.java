package xyz.game.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import xyz.game.generaator.ApiController;
import xyz.game.generaator.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import xyz.game.entity.Version;
import xyz.game.service.VersionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 版本记录(Version)表控制层
 *
 * @author makejava
 * @since 2024-06-15 16:49:21
 */
@RestController
@RequestMapping("version")
public class VersionController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private VersionService versionService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param version 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Version> page, Version version) {
        return success(this.versionService.page(page, new QueryWrapper<>(version)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.versionService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param version 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Version version) {
        return success(this.versionService.save(version));
    }

    /**
     * 修改数据
     *
     * @param version 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Version version) {
        return success(this.versionService.updateById(version));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.versionService.removeByIds(idList));
    }
}
