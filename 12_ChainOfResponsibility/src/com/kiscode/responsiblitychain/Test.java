package com.kiscode.responsiblitychain;

import com.kiscode.responsiblitychain.handle.HandlerA;
import com.kiscode.responsiblitychain.handle.HandlerB;
import com.kiscode.responsiblitychain.handle.HandlerC;
import com.kiscode.responsiblitychain.handle.HandlerChain;
import com.kiscode.responsiblitychain.leave.ChainOfResponsibilityClient;
import com.kiscode.responsiblitychain.leave.Request;
import com.kiscode.responsiblitychain.leave.Result;

import javax.swing.*;

/**
 * Description:
 * Author: keno
 * Date : 2021/5/26 11:13
 **/
public class Test {
    public static void main(String[] args) {

//        testHandlerChain();
        testLeave();
    }

    /***
     * 测试请休假责任链
     */
    private static void testLeave() {
        Request request = new Request(1, "欧洲旅游度假");
        ChainOfResponsibilityClient client = new ChainOfResponsibilityClient();
        Result result = client.execute(request);
        System.out.println(result);
    }

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
}
