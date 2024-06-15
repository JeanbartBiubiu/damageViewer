package xyz.game.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.game.dao.LevelDao;
import xyz.game.entity.Level;
import xyz.game.service.LevelService;
import org.springframework.stereotype.Service;

/**
 * 等级定义表(Level)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@Service("levelService")
public class LevelServiceImpl extends ServiceImpl<LevelDao, Level> implements LevelService {

}

