package xyz.game.service.impl;

import xyz.game.entity.Version;
import xyz.game.dao.VersionDao;
import xyz.game.service.VersionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * 版本记录(Version)表服务实现类
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
@Service("versionService")
public class VersionServiceImpl implements VersionService {
    @Resource
    private VersionDao versionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param versionId 主键
     * @return 实例对象
     */
    @Override
    public Version queryById(Integer versionId) {
        return this.versionDao.queryById(versionId);
    }

    /**
     * 分页查询
     *
     * @param version 筛选条件
     * @return 查询结果
     */
    @Override
    public List<Version> query(Version version) {
        return this.versionDao.query(version);
    }

    /**
     * 新增数据
     *
     * @param version 实例对象
     * @return 实例对象
     */
    @Override
    public Version insert(Version version) {
        this.versionDao.insert(version);
        return version;
    }

    /**
     * 修改数据
     *
     * @param version 实例对象
     * @return 实例对象
     */
    @Override
    public Version update(Version version) {
        this.versionDao.update(version);
        return this.queryById(version.getVersionId());
    }

    /**
     * 通过主键删除数据
     *
     * @param versionId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer versionId) {
        return this.versionDao.deleteById(versionId) > 0;
    }
}
