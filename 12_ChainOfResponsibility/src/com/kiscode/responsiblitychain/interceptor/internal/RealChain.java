package com.kiscode.responsiblitychain.interceptor.internal;

import java.util.List;

/**
 * Description:
 * Author: keno
 * Date : 2021/7/20 13:58
 **/
public class RealChain implements Interceptor.Chain {

    private int index;
    private Request request;
    private List<Interceptor> interceptorList;

    public RealChain(int index, Request request, List<Interceptor> interceptorList) {
        this.index = index;
        this.request = request;
        this.interceptorList = interceptorList;
    }

    @Override
    public Request request() {
        return request;
    }

    @Override
    public Response proceed(Request request) {

        Response response = null;
        if (index < interceptorList.size()) {
            //构建链上下一个节点
            RealChain nextChain = new RealChain(index + 1, request, interceptorList);

            //当前节点拦截器
            Interceptor interceptor = interceptorList.get(index);
            response = interceptor.intercept(nextChain);
        }
        return response;
    }
}
