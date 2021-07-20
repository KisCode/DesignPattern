package com.kiscode.responsiblitychain.interceptor;

import com.kiscode.responsiblitychain.interceptor.internal.Interceptor;
import com.kiscode.responsiblitychain.interceptor.internal.Request;
import com.kiscode.responsiblitychain.interceptor.internal.Response;

/**
 * Description:
 * Author: keno
 * Date : 2021/7/20 14:58
 **/
public class MyTestInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) {
        Request request = chain.request();
        request.header("log","MyTestInterceptor");
        return chain.proceed(request);
    }
}
