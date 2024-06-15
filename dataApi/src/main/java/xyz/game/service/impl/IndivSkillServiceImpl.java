package xyz.game.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.game.dao.IndivSkillDao;
import xyz.game.entity.IndivSkill;
import xyz.game.service.IndivSkillService;
import org.springframework.stereotype.Service;

/**
 * 人物-技能关联表(IndivSkill)表服务实现类
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@Service("indivSkillService")
public class IndivSkillServiceImpl extends ServiceImpl<IndivSkillDao, IndivSkill> implements IndivSkillService {

}

