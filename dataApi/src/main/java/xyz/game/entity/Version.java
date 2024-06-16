package xyz.game.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 版本记录(Version)实体类
 *
 * @author makejava
 * @since 2024-06-16 16:37:05
 */
public class Version implements Serializable {
    private static final long serialVersionUID = -51378202490038658L;

    private Integer versionId;

    private String versionCode;

    private Date updateTime;


    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}

