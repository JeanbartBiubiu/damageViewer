package xyz.game.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 人物-技能关联表(IndivSkill)表实体类
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@SuppressWarnings("serial")
public class IndivSkill extends Model<IndivSkill> {

    private Integer indivId;

    private Integer skillId;


    public Integer getIndivId() {
        return indivId;
    }

    public void setIndivId(Integer indivId) {
        this.indivId = indivId;
    }

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

}

