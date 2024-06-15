package xyz.game.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.game.dao.FormulaImplDao;
import xyz.game.entity.FormulaImpl;
import xyz.game.service.FormulaImplService;
import org.springframework.stereotype.Service;

/**
 * (FormulaImpl)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 16:49:21
 */
@Service("formulaImplService")
public class FormulaImplServiceImpl extends ServiceImpl<FormulaImplDao, FormulaImpl> implements FormulaImplService {

}

