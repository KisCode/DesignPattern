package com.kiscode.responsiblitychain.leave;

/**
 * Description:
 * Author: keno
 * Date : 2021/5/26 11:22
 **/
public interface Chain {
    /***
     * 获取当前处理请求
     * @return
     */
    Request request();

    /***
     * 处理请求
     * @param request
     * @return
     */
    Result proceed(Request request);
}
