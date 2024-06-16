package xyz.game.entity;

import java.io.Serializable;

/**
 * (Language)实体类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
public class Language implements Serializable {
    private static final long serialVersionUID = -77751876271926756L;

    private Integer languageId;

    private String languageName;


    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

}

