package com.kiscode.adapter.obj;


/**
 * Description:
 * Author: keno
 * Date : 2020/12/8 16:21
 **/
public class AirConditioner {
    public void powerOn(USATarget usaTarget) {
        int voltage = usaTarget.output110V();
        System.out.println("空调接通电源,电压：" + voltage);
    }
}
