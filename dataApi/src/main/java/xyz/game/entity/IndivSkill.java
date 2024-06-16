package xyz.game.entity;

import java.io.Serializable;

/**
 * 人物-技能关联表(IndivSkill)实体类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
public class IndivSkill implements Serializable {
    private static final long serialVersionUID = -44018894842947999L;

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

