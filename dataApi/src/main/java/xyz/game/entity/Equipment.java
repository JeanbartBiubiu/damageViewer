package xyz.game.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 装备表(buff等状态效果也定义为装备)(Equipment)表实体类
 *
 * @author makejava
 * @since 2024-06-15 16:49:21
 */
@SuppressWarnings("serial")
public class Equipment extends Model<Equipment> {

    private Integer equipId;

    private String equipImg;

    private Integer consumption;
//增加的属性数值表达式
    private String attributeExpression;


    public Integer getEquipId() {
        return equipId;
    }

    public void setEquipId(Integer equipId) {
        this.equipId = equipId;
    }

    public String getEquipImg() {
        return equipImg;
    }

    public void setEquipImg(String equipImg) {
        this.equipImg = equipImg;
    }

    public Integer getConsumption() {
        return consumption;
    }

    public void setConsumption(Integer consumption) {
        this.consumption = consumption;
    }

    public String getAttributeExpression() {
        return attributeExpression;
    }

    public void setAttributeExpression(String attributeExpression) {
        this.attributeExpression = attributeExpression;
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

