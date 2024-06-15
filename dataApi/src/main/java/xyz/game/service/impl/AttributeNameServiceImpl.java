package xyz.game.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.game.dao.AttributeNameDao;
import xyz.game.entity.AttributeName;
import xyz.game.service.AttributeNameService;
import org.springframework.stereotype.Service;

/**
 * 属性名称表(AttributeName)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 16:49:21
 */
@Service("attributeNameService")
public class AttributeNameServiceImpl extends ServiceImpl<AttributeNameDao, AttributeName> implements AttributeNameService {

}

