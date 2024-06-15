package xyz.game.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.game.dao.EquipIdDao;
import xyz.game.entity.EquipId;
import xyz.game.service.EquipIdService;
import org.springframework.stereotype.Service;

/**
 * (EquipId)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 16:49:21
 */
@Service("equipIdService")
public class EquipIdServiceImpl extends ServiceImpl<EquipIdDao, EquipId> implements EquipIdService {

}

