package xyz.game.entity;

import java.io.Serializable;

/**
 * 等级定义表(Level)实体类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
public class Level implements Serializable {
    private static final long serialVersionUID = -18807078983908994L;

    private Integer levelId;

    private Integer languageId;

    private String levelName;


    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

}

