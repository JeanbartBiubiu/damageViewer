package xyz.game.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.game.domain.Game;
import xyz.game.service.GameService;

import java.util.List;

@RestController
public class GameController {
    final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/game")
    public List<Game> getGame(){
        return gameService.getGame();
    }
}
