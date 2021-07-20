package com.kiscode.responsiblitychain.leave;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Author: keno
 * Date : 2021/5/26 11:35
 **/
public class ChainOfResponsibilityClient {
    private List<Ratify> ratifyList = new ArrayList<>();

    /**
     * 加入请求处理者
     *
     * @param ratify 审批人
     */
    public void addRatify(Ratify ratify) {
        ratifyList.add(ratify);
    }

    public Result execute(Request request) {
        ArrayList<Ratify> arrayList = new ArrayList<Ratify>();
        arrayList.addAll(ratifyList);

        arrayList.add(new GroupLeader());
        arrayList.add(new ManagerLeader());
        arrayList.add(new DepartmentHeader());

        //将多个接受者构成一条链 第一个节点
        RealChain realChain = new RealChain(arrayList, request, 0);
        return realChain.proceed(request);
    }
}
