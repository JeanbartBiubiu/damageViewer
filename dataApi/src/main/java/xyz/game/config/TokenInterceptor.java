package xyz.game.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import xyz.game.util.RedisUtil;

public class TokenInterceptor implements HandlerInterceptor {

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String method = request.getMethod();
        // 检查请求方法是否为 POST、PUT、DELETE
        if ("POST".equals(method) || "PUT".equals(method) || "DELETE".equals(method)) {
            // 从请求头获取 token
            String token = request.getHeader("Authorization");
            if (token == null || !redisUtil.hasKey("can_edit."+token)) {
                // 若 token 为空或 Redis 中不存在该 token，返回 401 状态码
                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                return false;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // 请求处理之后进行调用，但是在视图被渲染之前
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 整个请求完成之后被调用，也就是在 DispatcherServlet 渲染了对应的视图之后执行
    }
}