package com.kiscode.responsiblitychain.handle;

/**
 * Description:
 * Author: keno
 * Date : 2021/5/26 11:12
 **/
public class HandlerC implements IHandler{
    @Override
    public boolean process() {
        System.out.println("HandlerC process");
        return true;
    }
}