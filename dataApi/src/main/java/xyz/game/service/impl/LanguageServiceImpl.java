package xyz.game.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.game.dao.LanguageDao;
import xyz.game.entity.Language;
import xyz.game.service.LanguageService;
import org.springframework.stereotype.Service;

/**
 * (Language)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 16:49:21
 */
@Service("languageService")
public class LanguageServiceImpl extends ServiceImpl<LanguageDao, Language> implements LanguageService {

}

