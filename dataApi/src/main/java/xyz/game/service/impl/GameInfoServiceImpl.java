package xyz.game.service.impl;

import org.springframework.transaction.annotation.Transactional;
import xyz.game.dao.DDLDao;
import xyz.game.entity.GameInfo;
import xyz.game.dao.GameInfoDao;
import xyz.game.service.GameInfoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (GameInfo)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@Service("gameInfoService")
public class GameInfoServiceImpl implements GameInfoService {
    private final GameInfoDao gameInfoDao;
    private final DDLDao ddlDao;

    public GameInfoServiceImpl(GameInfoDao gameInfoDao,DDLDao ddlDao) {
        this.gameInfoDao = gameInfoDao;
        this.ddlDao = ddlDao;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param gameId 主键
     * @return 实例对象
     */
    @Override
    public GameInfo queryById(Integer gameId) {
        GameInfo gameInfo = new GameInfo();
        gameInfo.setGameId(gameId);
        return this.gameInfoDao.queryById(gameId,gameId);
    }

    /**
     * 分页查询
     *
     * @param gameInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<GameInfo> queryByPage(GameInfo gameInfo, PageRequest pageRequest) {
        long total = this.gameInfoDao.count(gameInfo);
        return new PageImpl<>(this.gameInfoDao.queryAllByLimit(gameInfo, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param gameInfo 实例对象
     * @return 实例对象
     */
    @Transactional
    @Override
    public GameInfo insert(GameInfo gameInfo) {
        // todo DDL语句执行算事务？
        this.gameInfoDao.insert(gameInfo);
        ddlDao.createDb(gameInfo.getGameCode());
        ddlDao.createTableAttribute(gameInfo.getGameCode());
        ddlDao.createTableAttributeName(gameInfo.getGameCode());
        ddlDao.createTableAttributeValue(gameInfo.getGameCode());
        ddlDao.createTableComputingLifeCycle(gameInfo.getGameCode());
        ddlDao.createTableEquipId(gameInfo.getGameCode());
        ddlDao.createTableEquipment(gameInfo.getGameCode());
        ddlDao.createTableEquipmentName(gameInfo.getGameCode());
        ddlDao.createTableFormulaDefault(gameInfo.getGameCode());
        ddlDao.createTableFormulaImpl(gameInfo.getGameCode());
        ddlDao.createTableIndividual(gameInfo.getGameCode());
        ddlDao.createTableIndivName(gameInfo.getGameCode());
        ddlDao.createTableIndivSkill(gameInfo.getGameCode());
        ddlDao.createTableLanguage(gameInfo.getGameCode());
        ddlDao.createTableLevel(gameInfo.getGameCode());
        ddlDao.createTableSkillDef(gameInfo.getGameCode());
        ddlDao.createTableSkillSub(gameInfo.getGameCode());
        ddlDao.createTableVersion(gameInfo.getGameCode());
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
}
