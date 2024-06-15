package xyz.game.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.game.dao.GameInfoDao;
import xyz.game.entity.GameInfo;
import xyz.game.service.GameInfoService;
import org.springframework.stereotype.Service;

/**
 * (GameInfo)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@Service("gameInfoService")
public class GameInfoServiceImpl extends ServiceImpl<GameInfoDao, GameInfo> implements GameInfoService {

}

