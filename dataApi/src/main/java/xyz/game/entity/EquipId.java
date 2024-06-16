package xyz.game.entity;

import java.io.Serializable;

/**
 * (EquipId)实体类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
public class EquipId implements Serializable {
    private static final long serialVersionUID = -60920987780641288L;

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

