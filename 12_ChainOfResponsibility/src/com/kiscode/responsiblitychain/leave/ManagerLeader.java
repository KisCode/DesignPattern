package com.kiscode.responsiblitychain.leave;

/**
 * Description:
 * Author: keno
 * Date : 2021/5/26 11:30
 **/
public class ManagerLeader implements Ratify {


    @Override
    public Result deal(Chain chain) {
        System.out.println("ManagerLeader deal");
        Request request = chain.request();
        if (request.getDays() > 3) {
            return chain.proceed(request);
        }
        return new Result(true, "ManagerLeader 同意！");
    }
}
