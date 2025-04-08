package xyz.game.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import xyz.game.dao.PvUvMapper;
import xyz.game.entity.PvUv;
import xyz.game.service.PvUvService;

@Service
public class PvUvServiceImpl extends ServiceImpl<PvUvMapper, PvUv> implements PvUvService {

    @Override
    public void savePvUvData(Long hour, Long pv, Long uv) {
        PvUv pvUv = new PvUv();
        pvUv.setHour(hour);
        pvUv.setPv(pv);
        pvUv.setUv(uv);
        this.save(pvUv);
    }
}