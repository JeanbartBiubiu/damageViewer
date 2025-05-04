package xyz.game.controller.login;

import lombok.Data;

@Data
public class SSOBody {
    private String token;
    private String email;
}
