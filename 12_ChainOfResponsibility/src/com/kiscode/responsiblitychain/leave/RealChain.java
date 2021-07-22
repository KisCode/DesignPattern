package com.kiscode.responsiblitychain.leave;

import java.util.List;

/**
 * Description:
 * Author: keno
 * Date : 2021/5/26 11:25
 **/
public class RealChain implements Chain {
    private Request request;
    private List<Ratify> ratifyList;
    public int index;

    public RealChain(List<Ratify> ratifyList, Request request, int index) {
        this.request = request;
        this.ratifyList = ratifyList;
        this.index = index;
    }

    @Override
    public Request request() {
        return request;
    }

    @Override
    public Result proceed(Request request) {
        Result result = null;
        if (ratifyList.size() > index) {
            Ratify ratify = ratifyList.get(index);
            RealChain realChain = new RealChain(ratifyList, request, index + 1);
            result = ratify.deal(realChain);
        }
        return result;
    }
}
