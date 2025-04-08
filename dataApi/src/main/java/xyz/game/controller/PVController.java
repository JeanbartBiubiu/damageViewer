package xyz.game.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.game.controller.global.DataWithPage;
import xyz.game.controller.global.ResponseData;
import xyz.game.entity.custom.AttributeReq;
import xyz.game.util.RedisUtil;

@RestController
@RequestMapping("/pv")
public class PVController {
    private final RedisUtil redisUtil;

    public PVController(RedisUtil redisUtil) {
        this.redisUtil = redisUtil;
    }

    @GetMapping
    public ResponseEntity<ResponseData<String>> query(@Param("uid")String uid) {
        ResponseData<String> resp = new ResponseData<>();
        redisUtil.increment(RedisUtil.PV);
        redisUtil.addSet(RedisUtil.UV,uid);
        resp.setData("ok");
        return ResponseEntity.ok(resp);
    }
}
