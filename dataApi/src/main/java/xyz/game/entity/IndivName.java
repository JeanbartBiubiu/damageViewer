package xyz.game.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (IndivName)表实体类
 *
 * @author makejava
 * @since 2024-06-15 16:49:20
 */
@SuppressWarnings("serial")
public class IndivName extends Model<IndivName> {

    private Integer indivId;

    private Integer languageId;

    private String indivName;


    public Integer getIndivId() {
        return indivId;
    }

    public void setIndivId(Integer indivId) {
        this.indivId = indivId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getIndivName() {
        return indivName;
    }

    public void setIndivName(String indivName) {
        this.indivName = indivName;
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

