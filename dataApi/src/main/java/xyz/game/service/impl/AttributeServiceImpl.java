package xyz.game.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.game.dao.AttributeDao;
import xyz.game.entity.Attribute;
import xyz.game.service.AttributeService;
import org.springframework.stereotype.Service;

/**
 * 属性表(Attribute)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@Service("attributeService")
public class AttributeServiceImpl extends ServiceImpl<AttributeDao, Attribute> implements AttributeService {

}

