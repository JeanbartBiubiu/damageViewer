package xyz.game.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.game.dao.VersionDao;
import xyz.game.entity.Version;
import xyz.game.service.VersionService;
import org.springframework.stereotype.Service;

/**
 * 版本记录(Version)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 16:49:21
 */
@Service("versionService")
public class VersionServiceImpl extends ServiceImpl<VersionDao, Version> implements VersionService {

}

