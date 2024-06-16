package xyz.game.service.impl;

import xyz.game.entity.Individual;
import xyz.game.dao.IndividualDao;
import xyz.game.service.IndividualService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Individual)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@Service("individualService")
public class IndividualServiceImpl implements IndividualService {
    @Resource
    private IndividualDao individualDao;

    /**
     * 通过ID查询单条数据
     *
     * @param indivId 主键
     * @return 实例对象
     */
    @Override
    public Individual queryById(Integer indivId) {
        return this.individualDao.queryById(indivId);
    }

    /**
     * 分页查询
     *
     * @param individual 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Individual> queryByPage(Individual individual, PageRequest pageRequest) {
        long total = this.individualDao.count(individual);
        return new PageImpl<>(this.individualDao.queryAllByLimit(individual, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param individual 实例对象
     * @return 实例对象
     */
    @Override
    public Individual insert(Individual individual) {
        this.individualDao.insert(individual);
        return individual;
    }

    /**
     * 修改数据
     *
     * @param individual 实例对象
     * @return 实例对象
     */
    @Override
    public Individual update(Individual individual) {
        this.individualDao.update(individual);
        return this.queryById(individual.getIndivId());
    }

    /**
     * 通过主键删除数据
     *
     * @param indivId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer indivId) {
        return this.individualDao.deleteById(indivId) > 0;
    }
}
