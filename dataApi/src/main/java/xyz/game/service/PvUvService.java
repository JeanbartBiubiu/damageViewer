package xyz.game.service;

import com.baomidou.mybatisplus.extension.service.IService;
import xyz.game.entity.PvUv;

public interface PvUvService extends IService<PvUv> {
    void savePvUvData(Long hour, Long pv, Long uv);
}