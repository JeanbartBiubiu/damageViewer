package xyz.game.entity;

import java.io.Serializable;

/**
 * (IndivName)实体类
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
public class IndivName implements Serializable {
    private static final long serialVersionUID = -75171202507033402L;

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

}

