package com.kiscode.responsiblitychain.handle;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Author: keno
 * Date : 2021/5/26 11:08
 **/
public class HandlerChain {
    private List<IHandler> handlerList = new ArrayList<>();

    public void addHandler(IHandler handler) {
        handlerList.add(handler);
    }

    public void process() {
        for (IHandler handler : handlerList) {
            boolean process = handler.process();
            if (process) {
                break;
            }
        }
    }
}
