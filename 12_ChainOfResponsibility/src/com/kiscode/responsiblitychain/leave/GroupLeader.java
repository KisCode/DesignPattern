package com.kiscode.responsiblitychain.leave;

/**
 * Description: 组长 可审批1天以内假期
 * Author: keno
 * Date : 2021/5/26 11:30
 **/
public class GroupLeader implements Ratify {


    @Override
    public Result deal(Chain chain) {
        System.out.println("GroupLeader deal：");
        Request request = chain.request();
        if (request.getDays() > 1) {
            return chain.proceed(request);
        }
        return new Result(true, "GroupLeader 同意！");
    }
}
