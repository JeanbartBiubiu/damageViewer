package xyz.game.entity;

import lombok.Data;
import lombok.ToString;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;

/**
 * (GameInfo)实体类
 *
 * @author makejava
 * @since 2024-06-15 19:17:13
 */
@Data
@ToString
public class GameInfo implements Serializable {
    private static final long serialVersionUID = 506879159668291936L;

    private Integer gameId;

    private String gameCode;

    private String gameName;

    private String gameImg;

}

