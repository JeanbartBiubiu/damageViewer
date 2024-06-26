package xyz.game.generaator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * REST API 通用控制器
 *
 * @author hubin
 * @since 2018-06-08
 */
// 使用度较低，如果使用请及时迁移本地 3.5.0 移除
public class ApiController {

    protected final Logger logger = LoggerFactory.getLogger(getClass());


    /**
     * 请求成功
     *
     * @param data 数据内容
     * @param <T>  对象泛型
     * @return ignore
     */
    protected <T> R<T> success(T data) {
        return R.ok(data);
    }

    /**
     * 请求失败
     *
     * @param msg 提示内容
     * @return ignore
     */
    protected <T> R<T> failed(String msg) {
        return R.failed(msg);
    }

    /**
     * 请求失败
     *
     * @param errorCode 请求错误码
     * @return ignore
     */
    protected <T> R<T> failed(IErrorCode errorCode) {
        return R.failed(errorCode);
    }

}
