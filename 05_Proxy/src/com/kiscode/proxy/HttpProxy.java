package com.kiscode.proxy;

import java.util.Map;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/24 21:51
 */
public class HttpProxy implements IHttpRequest {
    //持有真正被代理对象
    private IHttpRequest realHttpRequest;

    public HttpProxy(IHttpRequest realHttpRequest) {
        this.realHttpRequest = realHttpRequest;
    }

    @Override
    public void get(String url) {
        realHttpRequest.get(url);
    }

    @Override
    public void post(String url, Map<String, String> param) {
        realHttpRequest.post(url, param);
    }

    @Override
    public void put(String url, Map<String, String> param) {
        realHttpRequest.put(url, param);

    }

    @Override
    public void delete(String url) {
        realHttpRequest.delete(url);
    }
}
