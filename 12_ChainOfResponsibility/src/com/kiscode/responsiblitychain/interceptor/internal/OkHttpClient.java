package com.kiscode.responsiblitychain.interceptor.internal;

import com.kiscode.responsiblitychain.interceptor.CallServerInterceptor;
import com.kiscode.responsiblitychain.interceptor.DebugLoggerInterceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 根据okHttp源码自行实现一个 网络拦截器
 * 相比其他案例责任链上只有一个满足条件的节点处理请求 的纯责任链；而此处责任链模式所有节点(拦截器)会层层执行，向下传递
 * <p>
 * 责任链模式： 将请求和响应解耦；
 * Author: keno
 * Date : 2021/7/20 14:13
 **/
public class OkHttpClient {
    private List<Interceptor> interceptorList = new ArrayList<>();

    public OkHttpClient() {
    }

    public void addInterceptor(Interceptor interceptor) {
        interceptorList.add(interceptor);
    }

    /**
     * 简化版请求，隐藏Call等相关代码，此处主要展示责任链模式的使用
     *
     * @param request
     * @return
     */
    public Response execute(Request request) {
        //添加用户自定义拦截器
        List<Interceptor> interceptors = new ArrayList<>(interceptorList);

        //添加默认拦截器
        interceptors.add(new DebugLoggerInterceptor());
        interceptors.add(new CallServerInterceptor());

        //构建责任链上第一个节点
        Interceptor.Chain chain = new RealChain(0, request, interceptors);
        return chain.proceed(request);
    }

}
