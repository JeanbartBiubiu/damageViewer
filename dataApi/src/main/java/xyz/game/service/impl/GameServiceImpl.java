package xyz.game.service.impl;

import org.springframework.stereotype.Service;
import xyz.game.domain.Game;
import xyz.game.mapper.GameMapper;
import xyz.game.service.GameService;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {
    final GameMapper gameMapper;

    public GameServiceImpl(GameMapper gameMapper) {
        this.gameMapper = gameMapper;
    }

    @Override
    public List<Game> getGame() {
        return gameMapper.getList();
    }
}
