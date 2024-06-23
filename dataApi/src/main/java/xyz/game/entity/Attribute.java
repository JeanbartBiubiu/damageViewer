package xyz.game.entity;

import java.io.Serializable;

/**
 * 属性表(Attribute)实体类
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
public class Attribute implements Serializable {
    private static final long serialVersionUID = 513159944406902136L;

    private Integer attributeId;
/**
     * 属性图片
     */
    private String attributeImg;


    public Integer getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public String getAttributeImg() {
        return attributeImg;
    }

    public void setAttributeImg(String attributeImg) {
        this.attributeImg = attributeImg;
    }

}

