package xyz.game.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.jsf.el.SpringBeanFacesELResolver;
import xyz.game.dao.SchemaDao;

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
            map.putIfAbsent("currentSchema", "default_table");
        };
        return new MyBatisPlugin(consumer);
    }

}