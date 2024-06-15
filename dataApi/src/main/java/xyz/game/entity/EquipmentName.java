package xyz.game.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (EquipmentName)表实体类
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@SuppressWarnings("serial")
public class EquipmentName extends Model<EquipmentName> {

    private Integer equipId;

    private Integer languageId;

    private String equipName;


    public Integer getEquipId() {
        return equipId;
    }

    public void setEquipId(Integer equipId) {
        this.equipId = equipId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.equipId;
    }
}

