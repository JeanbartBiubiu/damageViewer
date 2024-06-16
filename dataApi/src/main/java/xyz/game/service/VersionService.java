package xyz.game.service;

import xyz.game.entity.Version;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 版本记录(Version)表服务接口
 *
 * @author makejava
 * @since 2024-06-16 16:37:05
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
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Version> queryByPage(Version version, PageRequest pageRequest);

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
