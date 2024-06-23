package xyz.game.entity;

import java.io.Serializable;

/**
 * (ComputingLifeCycle)实体类
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
public class ComputingLifeCycle implements Serializable {
    private static final long serialVersionUID = -91319314651923239L;

    private Integer cycleId;

    private Integer order;

    private String type;

    private String code;

    private String name;


    public Integer getCycleId() {
        return cycleId;
    }

    public void setCycleId(Integer cycleId) {
        this.cycleId = cycleId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

