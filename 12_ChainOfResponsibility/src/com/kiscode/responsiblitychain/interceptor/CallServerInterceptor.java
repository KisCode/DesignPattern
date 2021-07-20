package com.kiscode.responsiblitychain.interceptor;

import com.kiscode.responsiblitychain.interceptor.internal.Interceptor;
import com.kiscode.responsiblitychain.interceptor.internal.Request;
import com.kiscode.responsiblitychain.interceptor.internal.Response;

/**
 * Description: 网络请求链上最后一环
 * Author: keno
 * Date : 2021/7/20 14:40
 **/
public class CallServerInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) {
        Request request = chain.request();
        Response response = new Response();
        response.setBody(request.toString());
        return response;
    }
}
