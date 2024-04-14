package xyz.game.mapper;

import org.apache.ibatis.annotations.Mapper;
import xyz.game.domain.Game;

import java.util.List;

@Mapper
public interface GameMapper {
    List<Game> getList();
}
