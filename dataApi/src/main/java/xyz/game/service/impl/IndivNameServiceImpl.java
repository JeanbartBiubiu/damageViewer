package xyz.game.service.impl;

import xyz.game.entity.IndivName;
import xyz.game.dao.IndivNameDao;
import xyz.game.service.IndivNameService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (IndivName)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@Service("indivNameService")
public class IndivNameServiceImpl implements IndivNameService {
    @Resource
    private IndivNameDao indivNameDao;

    /**
     * 通过ID查询单条数据
     *
     * @param indivId 主键
     * @return 实例对象
     */
    @Override
    public IndivName queryById(Integer indivId) {
        return this.indivNameDao.queryById(indivId);
    }

    /**
     * 分页查询
     *
     * @param indivName 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<IndivName> queryByPage(IndivName indivName, PageRequest pageRequest) {
        long total = this.indivNameDao.count(indivName);
        return new PageImpl<>(this.indivNameDao.queryAllByLimit(indivName, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param indivName 实例对象
     * @return 实例对象
     */
    @Override
    public IndivName insert(IndivName indivName) {
        this.indivNameDao.insert(indivName);
        return indivName;
    }

    /**
     * 修改数据
     *
     * @param indivName 实例对象
     * @return 实例对象
     */
    @Override
    public IndivName update(IndivName indivName) {
        this.indivNameDao.update(indivName);
        return this.queryById(indivName.getIndivId());
    }

    /**
     * 通过主键删除数据
     *
     * @param indivId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer indivId) {
        return this.indivNameDao.deleteById(indivId) > 0;
    }
}
