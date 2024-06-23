package xyz.game.entity;

import java.io.Serializable;

/**
 * (EquipId)实体类
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
public class EquipId implements Serializable {
    private static final long serialVersionUID = -61531836822009450L;

    private Integer equipId;

    private Integer skillId;


    public Integer getEquipId() {
        return equipId;
    }

    public void setEquipId(Integer equipId) {
        this.equipId = equipId;
    }

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

}

