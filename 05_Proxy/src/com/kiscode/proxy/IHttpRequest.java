package com.kiscode.proxy;

import java.util.Map;

/****
 * Description: 定义一个网络请求
 * Author:  keno
 * CreateDate: 2020/11/24 21:46
 */
public interface IHttpRequest {
    void get(String url);

    void post(String url, Map<String, String> param);

    void put(String url, Map<String, String> param);

    void delete(String url);
}
