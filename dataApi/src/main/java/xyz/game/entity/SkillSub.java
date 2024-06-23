package xyz.game.entity;

import java.io.Serializable;

/**
 * (SkillSub)实体类
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
public class SkillSub implements Serializable {
    private static final long serialVersionUID = -77742090076131519L;

    private Integer skillId;

    private Integer skillLevle;

    private Integer cycleId;

    private String consumption;

    private String cd;

    private String checkAndDo;


    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public Integer getSkillLevle() {
        return skillLevle;
    }

    public void setSkillLevle(Integer skillLevle) {
        this.skillLevle = skillLevle;
    }

    public Integer getCycleId() {
        return cycleId;
    }

    public void setCycleId(Integer cycleId) {
        this.cycleId = cycleId;
    }

    public String getConsumption() {
        return consumption;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getCheckAndDo() {
        return checkAndDo;
    }

    public void setCheckAndDo(String checkAndDo) {
        this.checkAndDo = checkAndDo;
    }

}

