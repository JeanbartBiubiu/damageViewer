package xyz.game.controller;

import xyz.game.entity.GameInfo;
import xyz.game.service.GameInfoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (GameInfo)表控制层
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@RestController
@RequestMapping("gameInfo")
public class GameInfoController {
    /**
     * 服务对象
     */
    @Resource
    private GameInfoService gameInfoService;

    /**
     * 分页查询
     *
     * @param gameInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<GameInfo>> queryByPage(GameInfo gameInfo, PageRequest pageRequest) {
        return ResponseEntity.ok(this.gameInfoService.queryByPage(gameInfo, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<GameInfo> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.gameInfoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param gameInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<GameInfo> add(@RequestBody GameInfo gameInfo) {
        System.out.println(gameInfo);
        return ResponseEntity.ok(this.gameInfoService.insert(gameInfo));
    }

    /**
     * 编辑数据
     *
     * @param gameInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<GameInfo> edit(GameInfo gameInfo) {
        return ResponseEntity.ok(this.gameInfoService.update(gameInfo));
    }

}

