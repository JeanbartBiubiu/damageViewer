package xyz.game.controller;

import xyz.game.entity.Version;
import xyz.game.service.VersionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 版本记录(Version)表控制层
 *
 * @author makejava
 * @since 2024-06-16 16:37:05
 */
@RestController
@RequestMapping("version")
public class VersionController {
    /**
     * 服务对象
     */
    @Resource
    private VersionService versionService;

    /**
     * 分页查询
     *
     * @param version 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Version>> queryByPage(Version version, PageRequest pageRequest) {
        return ResponseEntity.ok(this.versionService.queryByPage(version, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Version> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.versionService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param version 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Version> add(Version version) {
        return ResponseEntity.ok(this.versionService.insert(version));
    }

    /**
     * 编辑数据
     *
     * @param version 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Version> edit(Version version) {
        return ResponseEntity.ok(this.versionService.update(version));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.versionService.deleteById(id));
    }

}

