package xyz.game.service;

import xyz.game.entity.GameInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (GameInfo)表服务接口
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
public interface GameInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param gameId 主键
     * @return 实例对象
     */
    GameInfo queryById(Integer gameId);

    /**
     * 分页查询
     *
     * @param gameInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    List<GameInfo> query(GameInfo gameInfo);

    /**
     * 新增数据
     *
     * @param gameInfo 实例对象
     * @return 实例对象
     */
    GameInfo insert(GameInfo gameInfo);

    /**
     * 修改数据
     *
     * @param gameInfo 实例对象
     * @return 实例对象
     */
    GameInfo update(GameInfo gameInfo);

}
