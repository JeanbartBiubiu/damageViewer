package xyz.game.service.impl;

import xyz.game.entity.GameInfo;
import xyz.game.dao.GameInfoDao;
import xyz.game.service.GameInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * (GameInfo)表服务实现类
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
@Service("gameInfoService")
public class GameInfoServiceImpl implements GameInfoService {
    @Resource
    private GameInfoDao gameInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param gameId 主键
     * @return 实例对象
     */
    @Override
    public GameInfo queryById(Integer gameId) {
        return this.gameInfoDao.queryById(gameId);
    }

    /**
     * 分页查询
     *
     * @param gameInfo 筛选条件
     * @return 查询结果
     */
    @Override
    public List<GameInfo> query(GameInfo gameInfo) {
        return this.gameInfoDao.query(gameInfo);
    }

    /**
     * 新增数据
     *
     * @param gameInfo 实例对象
     * @return 实例对象
     */
    @Override
    public GameInfo insert(GameInfo gameInfo) {
        this.gameInfoDao.insert(gameInfo);
        return gameInfo;
    }

    /**
     * 修改数据
     *
     * @param gameInfo 实例对象
     * @return 实例对象
     */
    @Override
    public GameInfo update(GameInfo gameInfo) {
        this.gameInfoDao.update(gameInfo);
        return this.queryById(gameInfo.getGameId());
    }

    /**
     * 通过主键删除数据
     *
     * @param gameId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer gameId) {
        return this.gameInfoDao.deleteById(gameId) > 0;
    }
}
