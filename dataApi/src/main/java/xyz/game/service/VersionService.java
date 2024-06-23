package xyz.game.service;

import xyz.game.entity.Version;

import java.util.List;

/**
 * 版本记录(Version)表服务接口
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
public interface VersionService {

    /**
     * 通过ID查询单条数据
     *
     * @param versionId 主键
     * @return 实例对象
     */
    Version queryById(Integer versionId);

    /**
     * 分页查询
     *
     * @param version 筛选条件
     * @return 查询结果
     */
    List<Version> query(Version version);

    /**
     * 新增数据
     *
     * @param version 实例对象
     * @return 实例对象
     */
    Version insert(Version version);

    /**
     * 修改数据
     *
     * @param version 实例对象
     * @return 实例对象
     */
    Version update(Version version);

    /**
     * 通过主键删除数据
     *
     * @param versionId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer versionId);

}
