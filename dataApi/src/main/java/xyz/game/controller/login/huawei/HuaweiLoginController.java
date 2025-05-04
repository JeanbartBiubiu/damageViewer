package xyz.game.controller.login.huawei;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.game.controller.global.DataWithPage;
import xyz.game.controller.global.ResponseData;
import xyz.game.controller.login.SSOBody;
import xyz.game.entity.custom.AttributeReq;
import xyz.game.service.EmailService;

import java.util.List;

/**
 * 属性表(Attribute)表控制层
 *
 * @author makejava
 * @since 2024-06-23 21:23:34
 */
@RestController
@RequestMapping("/login/huawei")
public class HuaweiLoginController {
    /**
     * 服务对象
     */
    private final EmailService emailService;


    public HuaweiLoginController(EmailService emailService) {
        this.emailService = emailService;
    }

    /**
     *  获取token
     */
    @PostMapping("token")
    public ResponseEntity<ResponseData<String>> query(@RequestBody SSOBody ssoBody) {
        ResponseData<String> resp = new ResponseData<>();
        String token = emailService.huaweiLogin(ssoBody.getToken(), ssoBody.getEmail());
        if (token == null) {
            return ResponseEntity.badRequest().build();
        }
        resp.setData(token);
        return ResponseEntity.ok(resp);
    }

}

