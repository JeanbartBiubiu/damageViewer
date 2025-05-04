package xyz.game.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.game.entity.Email;
import xyz.game.entity.PvUv;

import java.util.List;

public interface EmailService extends IService<Email> {
    String huaweiLogin(String token, String email);

    String googleLogin(String token, String email);

}