package com.kiscode.responsiblitychain;

import com.kiscode.responsiblitychain.handle.HandlerA;
import com.kiscode.responsiblitychain.handle.HandlerB;
import com.kiscode.responsiblitychain.handle.HandlerC;
import com.kiscode.responsiblitychain.handle.HandlerChain;
import com.kiscode.responsiblitychain.interceptor.MyTestInterceptor;
import com.kiscode.responsiblitychain.interceptor.internal.OkHttpClient;
import com.kiscode.responsiblitychain.interceptor.internal.Response;
import com.kiscode.responsiblitychain.leave.ChainOfResponsibilityClient;
import com.kiscode.responsiblitychain.leave.Request;
import com.kiscode.responsiblitychain.leave.Result;

/**
 * Description:
 * Author: keno
 * Date : 2021/5/26 11:13
 **/
public class Test {
    public static void main(String[] args) {


//        testHandlerChain();
//        testLeave();

        testOkHttpRequest();
    }

    /***
     * 测试请休假责任链
     */
    private static void testLeave() {
        //请求角色
        Request request = new Request(7, "欧洲旅游度假");

        //责任链角色
        ChainOfResponsibilityClient client = new ChainOfResponsibilityClient();

        //执行请求
        Result result = client.execute(request);
        System.out.println(result);
    }

    /**
     * 测试 基础的责任链演示
     */
    private static void testHandlerChain() {
        HandlerChain handlerChain = new HandlerChain();

        HandlerA handlerA = new HandlerA();
        HandlerB handlerB = new HandlerB();
        HandlerC handlerC = new HandlerC();

        handlerChain.addHandler(handlerA);
        handlerChain.addHandler(handlerB);
        handlerChain.addHandler(handlerC);

        handlerChain.process();
    }


    private static void testOkHttpRequest() {
        String url = "https://www.google.com";
        com.kiscode.responsiblitychain.interceptor.internal.Request request = new com.kiscode.responsiblitychain.interceptor.internal.Request(url);
        OkHttpClient okHttpClient = new OkHttpClient();

        okHttpClient.addInterceptor(new MyTestInterceptor());   //添加拦截器

        Response response = okHttpClient.execute(request);

        System.out.println("response is " + response.getBody());
//        okHttpClient.newCall(request);
    }

}
