package xyz.game.service.impl;

import xyz.game.entity.Level;
import xyz.game.dao.LevelDao;
import xyz.game.service.LevelService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 等级定义表(Level)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@Service("levelService")
public class LevelServiceImpl implements LevelService {
    @Resource
    private LevelDao levelDao;

    /**
     * 通过ID查询单条数据
     *
     * @param levelId 主键
     * @return 实例对象
     */
    @Override
    public Level queryById(Integer levelId) {
        return this.levelDao.queryById(levelId);
    }

    /**
     * 分页查询
     *
     * @param level 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Level> queryByPage(Level level, PageRequest pageRequest) {
        long total = this.levelDao.count(level);
        return new PageImpl<>(this.levelDao.queryAllByLimit(level, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param level 实例对象
     * @return 实例对象
     */
    @Override
    public Level insert(Level level) {
        this.levelDao.insert(level);
        return level;
    }

    /**
     * 修改数据
     *
     * @param level 实例对象
     * @return 实例对象
     */
    @Override
    public Level update(Level level) {
        this.levelDao.update(level);
        return this.queryById(level.getLevelId());
    }

    /**
     * 通过主键删除数据
     *
     * @param levelId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer levelId) {
        return this.levelDao.deleteById(levelId) > 0;
    }
}
