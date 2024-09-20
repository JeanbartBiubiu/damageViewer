package xyz.game.entity.custom;

import lombok.Data;

import java.util.List;

@Data
public class EquipmentReq {
    private Integer equipmentId;
    private Integer languageId;
    private String equipmentName;

    private String equipmentImg;

    private Integer consumption;
    /**
     * 增加的属性数值表达式
     */
    private String attributeExpression;

    /**
     * 子装备，id列表
     */
    private List<String> subEquips;

}
