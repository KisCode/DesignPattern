package com.kiscode.responsiblitychain.leave;

/**
 * Description: 请假审批结果
 * Author: keno
 * Date : 2021/5/26 11:19
 **/
public class Result {
    /***
     * 是否同意
     */
    private boolean isAgree;

    /***
     * 审批意见
     */
    private String info;

    public Result(boolean isAgree, String info) {
        this.isAgree = isAgree;
        this.info = info;
    }

    public boolean isAgree() {
        return isAgree;
    }

    public void setAgree(boolean agree) {
        isAgree = agree;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Result{" +
                "isAgree=" + isAgree +
                ", info='" + info + '\'' +
                '}';
    }
}
