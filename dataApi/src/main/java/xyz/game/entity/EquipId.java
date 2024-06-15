package xyz.game.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (EquipId)表实体类
 *
 * @author makejava
 * @since 2024-06-15 16:49:21
 */
@SuppressWarnings("serial")
public class EquipId extends Model<EquipId> {

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

