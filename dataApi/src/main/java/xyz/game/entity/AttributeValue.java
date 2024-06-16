package xyz.game.entity;

import java.io.Serializable;

/**
 * 单位-属性-等级对应数据数值(AttributeValue)实体类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
public class AttributeValue implements Serializable {
    private static final long serialVersionUID = -15178661821179058L;

    private Integer indivId;

    private Integer attributeId;

    private Integer levelId;

    private Integer value;


    public Integer getIndivId() {
        return indivId;
    }

    public void setIndivId(Integer indivId) {
        this.indivId = indivId;
    }

    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}

