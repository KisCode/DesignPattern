package com.kiscode.responsiblitychain.interceptor;

import com.kiscode.responsiblitychain.interceptor.internal.Interceptor;
import com.kiscode.responsiblitychain.interceptor.internal.Request;
import com.kiscode.responsiblitychain.interceptor.internal.Response;

/**
 * Description:
 * Author: keno
 * Date : 2021/7/20 14:23
 **/
public class DebugLoggerInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) {
        Request request = chain.request();
        request.header("DebugLogger", "DebugLoggerInterceptor");
        System.out.println("DebugLoggerInterceptor");
        return chain.proceed(request);
    }
}
