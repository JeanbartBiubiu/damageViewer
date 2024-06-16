package xyz.game.config;

import jakarta.annotation.PostConstruct;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


/**
 * 拦截器配置
 *
 * @author xm.z
 */
@Configuration
public class MybatisConfig {

    @Bean
    public MyBatisPlugin myBatisPlugin() {
        Consumer<Map<String, Object>> consumer = map -> {
            // 基本信息
            map.putIfAbsent("whichGame", "default_table");
        };
        return new MyBatisPlugin(consumer);
    }

}