package com.kiscode.responsiblitychain.leave;

/**
 * Description: 请假对象封装
 * Author: keno
 * Date : 2021/5/26 11:18
 **/
public class Request {
    private int days;
    private String reason;

    public Request() {
    }

    public Request(int days, String reason) {
        this.days = days;
        this.reason = reason;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
