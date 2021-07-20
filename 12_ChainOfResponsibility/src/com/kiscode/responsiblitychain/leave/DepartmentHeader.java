package com.kiscode.responsiblitychain.leave;

/**
 * Description: 部门总经理 可审批7天以内假期
 * Author: keno
 * Date : 2021/5/26 11:30
 **/
public class DepartmentHeader implements Ratify {


    @Override
    public Result deal(Chain chain) {
        System.out.println("DepartmentHeader deal");
        Request request = chain.request();
        if (request.getDays() > 7) {
            return new Result(false, "超过7天,DepartmentHeader 无权限审批！");
        }
        return new Result(true, "DepartmentHeader 同意！");
    }
}
