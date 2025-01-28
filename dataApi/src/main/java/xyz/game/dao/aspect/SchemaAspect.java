package xyz.game.dao.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import xyz.game.dao.SchemaDao;
import xyz.game.entity.EmptyDaoObject;


@Aspect
@Component
public class SchemaAspect {
    private final SchemaDao schemaDao;

    public SchemaAspect(SchemaDao schemaDao) {
        this.schemaDao = schemaDao;
    }

    // 定义一个切点，匹配所有service
    // TODO 是不是切controller好点
    @Pointcut("execution(* xyz.game.service..*.*(..))")
    public void includePointcut() {
    }
 
    // 前置通知，在方法执行前打印日志
    @Before("includePointcut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        // TODO 需要一个处理，每次请求只执行一次
        schemaDao.chooseSchema("default_table");
    }
}