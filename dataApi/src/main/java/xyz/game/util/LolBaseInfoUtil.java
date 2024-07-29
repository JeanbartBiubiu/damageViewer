package xyz.game.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.io.*;
import java.util.Map;

public class LolBaseInfoUtil {
    @Data
    public static class LolStats {
        private int hp;
        private int hpPer;
        private int mp;
        private double mpPer;
        private int speed;
        private int armor;
        private double armorPer;
        private int spellBlock;
        private double spellBlockPer;
        private int attackRange;
        private double hpRegen;
        private double hpRegenPer;
        private double mpRegen;
        private double mpRegenPer;
        private int attack;
        private double attackPer;
        private double attackSpeed;
        private double attackSpeedPer;

    }

    @Data
    public static class LolStatsStruct{
        private int indivId;
        private int levelId;
        private int attributeId;
        private double value;

    }
    public static void main(String[] args) throws IOException {
        BuildLolInfo();
    }
    public static void BuildLolInfo() throws IOException {
        File parentFile = new File("C:\\Users\\Administrator\\Desktop\\新建文件夹\\14.14.1\\data\\zh_CN\\champion");
        for (File file : parentFile.listFiles()) {
            ObjectMapper objectMapper = new ObjectMapper();
            Map map = objectMapper.readValue(file, Map.class);
            Map dataBody = (Map)map.get("data");
            for (Object value : dataBody.values()) {
               Map mapV = (Map)value;
                String title = (String)mapV.get("title");
                System.out.println(title);
                Map<String,String> statsMap =  (Map<String,String>)mapV.get("stats");
                System.out.println(statsMap);
                LolStats stats = getStats(statsMap);
                System.out.println(stats);
            }
        }

    }
    public static LolStats getStats(Map map){
        LolStats stats = new LolStats();
        stats.setHp((int)map.get("hp"));
        stats.setHpPer((int)map.get("hpperlevel"));
        stats.setMp((int)map.get("mp"));
        stats.setMpPer(Double.parseDouble(map.get("mpperlevel").toString()));
        stats.setSpeed((int)map.get("movespeed"));
        stats.setArmor((int)map.get("armor"));
        stats.setArmorPer(Double.parseDouble(map.get("armorperlevel").toString()));
        stats.setSpellBlock((int)map.get("spellblock"));
        stats.setSpellBlockPer((double)map.get("spellblockperlevel"));
        stats.setAttackRange((int)map.get("attackrange"));
        stats.setHpRegen(Double.parseDouble(map.get("hpregen").toString()));
        stats.setHpRegenPer(Double.parseDouble(map.get("hpregenperlevel").toString()));
        stats.setMpRegen(Double.parseDouble(map.get("mpregen").toString()));
        stats.setMpRegenPer(Double.parseDouble(map.get("mpregenperlevel").toString()));
        stats.setAttack((int)map.get("attackdamage"));
        stats.setAttackPer(Double.parseDouble(map.get("attackdamageperlevel").toString()));
        stats.setAttackSpeed(Double.parseDouble(map.get("attackspeedperlevel").toString()));
        stats.setAttackSpeedPer(Double.parseDouble(map.get("attackspeed").toString()));
        return stats;
    }
}
