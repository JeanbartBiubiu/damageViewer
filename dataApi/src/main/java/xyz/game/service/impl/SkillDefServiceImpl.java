package xyz.game.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.game.dao.SkillDefDao;
import xyz.game.entity.SkillDef;
import xyz.game.service.SkillDefService;
import org.springframework.stereotype.Service;

/**
 * 技能定义表(SkillDef)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@Service("skillDefService")
public class SkillDefServiceImpl extends ServiceImpl<SkillDefDao, SkillDef> implements SkillDefService {

}

