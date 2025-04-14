package xyz.game.entity;

import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * (EquipId)实体类
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
public class EquipId implements Serializable {
    private static final long serialVersionUID = -61531836822009450L;

    @TableId
    private Integer equipId;

    @TableId
    private Integer attributeId;

    private Long addValue;

    private Double multiValue;

}

