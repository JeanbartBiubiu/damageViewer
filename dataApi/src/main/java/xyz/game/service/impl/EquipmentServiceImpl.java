package xyz.game.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.game.dao.EquipmentDao;
import xyz.game.entity.Equipment;
import xyz.game.service.EquipmentService;
import org.springframework.stereotype.Service;

/**
 * 装备表(buff等状态效果也定义为装备)(Equipment)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 16:49:21
 */
@Service("equipmentService")
public class EquipmentServiceImpl extends ServiceImpl<EquipmentDao, Equipment> implements EquipmentService {

}

