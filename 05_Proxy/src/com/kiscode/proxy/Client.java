package com.kiscode.proxy;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/24 21:50
 */
public class Client {
    private static final String URL = "https://www.facebook.com";

    public static void main(String[] args) {
        //此实例通过伪代码示范 通过代理模式无缝切换网络请求

        /*
        模拟需求：Android项目将原有使用OkGo网络请求框架替换为Volley
        代理+外观模式 分离业务代码和技术代码

        首先通过IIHttpRequest接口约定了四种网络请求的方式GET/POST/PUT/DELETE,在OKGoRequest的具体实现网络请求，底层则使用OKGO进行网络请求（此处OKGoRequest作为一个门面）

        后来发现更好用的网络框架Volley,使用同样的方式实现VolleyRequest门面类

        客户端在初始化HttpProxy代理时，通过指定代理真正持有对象为VolleyRequest,即完成了了项目网络框架从OKGo到Volley的无缝替换
        前提：客户端执行网络请求通过HttpProxy进行

         */

//        IHttpRequest httpRequest = new Volley();
        IHttpRequest httpRequest = new OKGoRequest();
        HttpProxy proxy = new HttpProxy(httpRequest);
        proxy.get(URL);
        proxy.post(URL, null);
        proxy.put(URL, null);
        proxy.delete(URL);
    }
}
