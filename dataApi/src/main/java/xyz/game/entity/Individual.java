package xyz.game.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (Individual)表实体类
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@SuppressWarnings("serial")
public class Individual extends Model<Individual> {
//英雄单位标识
    private Integer indivId;
//头像
    private String indivImg;


    public Integer getIndivId() {
        return indivId;
    }

    public void setIndivId(Integer indivId) {
        this.indivId = indivId;
    }

    public String getIndivImg() {
        return indivImg;
    }

    public void setIndivImg(String indivImg) {
        this.indivImg = indivImg;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.indivId;
    }
}

