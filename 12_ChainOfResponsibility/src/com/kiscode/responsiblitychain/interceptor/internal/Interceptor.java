package com.kiscode.responsiblitychain.interceptor.internal;

/**
 * Description: 拦截器(抽象处理者角色)
 * Author: keno
 * Date : 2021/7/20 13:54
 **/
public interface Interceptor {
    Response intercept(Chain chain);

    interface Chain {
        Request request();

        Response proceed(Request request);
    }
}
