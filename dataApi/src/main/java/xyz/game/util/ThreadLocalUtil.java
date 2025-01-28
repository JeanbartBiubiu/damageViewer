package xyz.game.util;

import java.util.Map;

/**
 * jdk21虚拟线程对threadLocal做了支持，可以继续使用
 */
public class ThreadLocalUtil {
    private static final ThreadLocal<Map<String, String>> threadLocal = new ThreadLocal<>();

    public static void set(String k, String v) {
        Map<String, String> threadMap = threadLocal.get();
        if (threadMap == null) {
            threadMap = Map.of(k, v);
            threadLocal.set(threadMap);
        } else {
            threadMap.put(k, v);
        }
    }

    public static String get(String k) {
        Map<String, String> threadMap = threadLocal.get();
        if (threadMap == null) {
            return null;
        } else {
            threadMap.entrySet().forEach(System.out::println);
            return threadMap.get(k);
        }
    }

    public static String getOrDefault(String k, String defaultValue) {
        // todo 没go那个赋值语法
        String s = get(k);
        return s == null ? defaultValue : s;
    }

    public static void remove() {
        ThreadLocal<Map<String, String>> objectThreadLocal = new ThreadLocal<>();
        Map<String, String> stringStringMap = objectThreadLocal.get();
        if (stringStringMap != null) {
            objectThreadLocal.get().clear();
        }
        objectThreadLocal.remove();
    }
}
