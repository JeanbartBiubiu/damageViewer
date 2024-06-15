package xyz.game.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 单位-属性-等级对应数据数值(AttributeValue)表实体类
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@SuppressWarnings("serial")
public class AttributeValue extends Model<AttributeValue> {

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

