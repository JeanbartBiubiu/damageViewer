package xyz.game.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.game.dao.AttributeValueDao;
import xyz.game.entity.AttributeValue;
import xyz.game.service.AttributeValueService;
import org.springframework.stereotype.Service;

/**
 * 单位-属性-等级对应数据数值(AttributeValue)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@Service("attributeValueService")
public class AttributeValueServiceImpl extends ServiceImpl<AttributeValueDao, AttributeValue> implements AttributeValueService {

}

