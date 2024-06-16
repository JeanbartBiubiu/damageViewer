package xyz.game.entity;

import java.io.Serializable;

/**
 * (EquipmentName)实体类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
public class EquipmentName implements Serializable {
    private static final long serialVersionUID = -14035587488288371L;

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

}

