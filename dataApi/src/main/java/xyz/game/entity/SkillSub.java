package xyz.game.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (SkillSub)表实体类
 *
 * @author makejava
 * @since 2024-06-15 16:49:21
 */
@SuppressWarnings("serial")
public class SkillSub extends Model<SkillSub> {

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

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.skillId;
    }
}

