package xyz.game.service.impl;

import xyz.game.entity.ComputingLifeCycle;
import xyz.game.dao.ComputingLifeCycleDao;
import xyz.game.service.ComputingLifeCycleService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (ComputingLifeCycle)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@Service("computingLifeCycleService")
public class ComputingLifeCycleServiceImpl implements ComputingLifeCycleService {
    @Resource
    private ComputingLifeCycleDao computingLifeCycleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cycleId 主键
     * @return 实例对象
     */
    @Override
    public ComputingLifeCycle queryById(Integer cycleId) {
        return this.computingLifeCycleDao.queryById(cycleId);
    }

    /**
     * 分页查询
     *
     * @param computingLifeCycle 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ComputingLifeCycle> queryByPage(ComputingLifeCycle computingLifeCycle, PageRequest pageRequest) {
        long total = this.computingLifeCycleDao.count(computingLifeCycle);
        return new PageImpl<>(this.computingLifeCycleDao.queryAllByLimit(computingLifeCycle, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param computingLifeCycle 实例对象
     * @return 实例对象
     */
    @Override
    public ComputingLifeCycle insert(ComputingLifeCycle computingLifeCycle) {
        this.computingLifeCycleDao.insert(computingLifeCycle);
        return computingLifeCycle;
    }

    /**
     * 修改数据
     *
     * @param computingLifeCycle 实例对象
     * @return 实例对象
     */
    @Override
    public ComputingLifeCycle update(ComputingLifeCycle computingLifeCycle) {
        this.computingLifeCycleDao.update(computingLifeCycle);
        return this.queryById(computingLifeCycle.getCycleId());
    }

    /**
     * 通过主键删除数据
     *
     * @param cycleId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cycleId) {
        return this.computingLifeCycleDao.deleteById(cycleId) > 0;
    }
}
