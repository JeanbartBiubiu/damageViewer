package xyz.game.entity;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;

/**
 * (GameInfo)实体类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
public class GameInfo implements Serializable {
    private static final long serialVersionUID = 506879159668291936L;

    private Integer gameId;

    private String gameCode;

    private String gameName;

    private String gameImg;


    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGameCode() {
        return gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameImg() {
        return gameImg;
    }

    public void setGameImg(String gameImg) {
        this.gameImg = gameImg;
    }

}

