package com.kiscode.adapter;

import com.kiscode.adapter.clz.Phone;
import com.kiscode.adapter.clz.VoltageAdapter;
import com.kiscode.adapter.obj.AirConditioner;
import com.kiscode.adapter.obj.ChineseVoltage;
import com.kiscode.adapter.obj.USATarget;
import com.kiscode.adapter.obj.USAdapter;

public class Client {
    public static void main(String[] args) {
        //类适配器的使用演示
        VoltageAdapter adapter = new VoltageAdapter();
        Phone phone = new Phone();
        phone.charging(adapter);

        //对象适配器的使用
        AirConditioner airConditioner = new AirConditioner();
        ChineseVoltage chineseVoltage = new ChineseVoltage();
        USATarget usaTarget = new USAdapter(chineseVoltage);
        airConditioner.powerOn(usaTarget);
    }
}
