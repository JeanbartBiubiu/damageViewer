package xyz.game.controller;

import xyz.game.entity.Language;
import xyz.game.service.LanguageService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Language)表控制层
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@RestController
@RequestMapping("language")
public class LanguageController {
    /**
     * 服务对象
     */
    @Resource
    private LanguageService languageService;

    /**
     * 分页查询
     *
     * @param language 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Language>> queryByPage(Language language, PageRequest pageRequest) {
        return ResponseEntity.ok(this.languageService.queryByPage(language, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Language> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.languageService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param language 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Language> add(Language language) {
        return ResponseEntity.ok(this.languageService.insert(language));
    }

    /**
     * 编辑数据
     *
     * @param language 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Language> edit(Language language) {
        return ResponseEntity.ok(this.languageService.update(language));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.languageService.deleteById(id));
    }

}

