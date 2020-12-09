package com.kiscode.adapter.clz;

/**
 * Description:
 * Author: keno
 * Date : 2020/12/8 8:48
 **/
public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        int voltage = iVoltage5V.output5V();
        System.out.println("手机开始充电,电压：" + voltage);
    }
}
