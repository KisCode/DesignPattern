package com.kiscode.responsiblitychain.leave;

/**
 * Description:
 * Author: keno
 * Date : 2021/5/26 11:30
 **/
public class DepartmentHeader implements Ratify {


    @Override
    public Result deal(Chain chain) {
        System.out.println("DepartmentHeader deal");
        Request request = chain.request();
        if (request.getDays() > 7) {
            return new Result(false, "DepartmentHeader 不同意！");
        }
        return new Result(true, "DepartmentHeader 同意！");
    }
}
