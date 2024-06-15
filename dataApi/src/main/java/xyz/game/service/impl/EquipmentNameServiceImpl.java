package xyz.game.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.game.dao.EquipmentNameDao;
import xyz.game.entity.EquipmentName;
import xyz.game.service.EquipmentNameService;
import org.springframework.stereotype.Service;

/**
 * (EquipmentName)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@Service("equipmentNameService")
public class EquipmentNameServiceImpl extends ServiceImpl<EquipmentNameDao, EquipmentName> implements EquipmentNameService {

}

