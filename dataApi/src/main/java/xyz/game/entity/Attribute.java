package xyz.game.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 属性表(Attribute)表实体类
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@SuppressWarnings("serial")
public class Attribute extends Model<Attribute> {

    private Integer attributeId;
//属性图片
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

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.attributeId;
    }
}

