package xyz.game.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.game.dao.IndividualDao;
import xyz.game.entity.Individual;
import xyz.game.service.IndividualService;
import org.springframework.stereotype.Service;

/**
 * (Individual)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@Service("individualService")
public class IndividualServiceImpl extends ServiceImpl<IndividualDao, Individual> implements IndividualService {

}

