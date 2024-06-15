package xyz.game.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.game.dao.IndivNameDao;
import xyz.game.entity.IndivName;
import xyz.game.service.IndivNameService;
import org.springframework.stereotype.Service;

/**
 * (IndivName)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@Service("indivNameService")
public class IndivNameServiceImpl extends ServiceImpl<IndivNameDao, IndivName> implements IndivNameService {

}

