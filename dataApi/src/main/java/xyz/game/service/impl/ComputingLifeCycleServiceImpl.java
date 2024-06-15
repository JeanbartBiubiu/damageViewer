package xyz.game.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.game.dao.ComputingLifeCycleDao;
import xyz.game.entity.ComputingLifeCycle;
import xyz.game.service.ComputingLifeCycleService;
import org.springframework.stereotype.Service;

/**
 * (ComputingLifeCycle)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 16:49:21
 */
@Service("computingLifeCycleService")
public class ComputingLifeCycleServiceImpl extends ServiceImpl<ComputingLifeCycleDao, ComputingLifeCycle> implements ComputingLifeCycleService {

}

