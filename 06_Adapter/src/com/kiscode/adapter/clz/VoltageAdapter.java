package com.kiscode.adapter.clz;

public class VoltageAdapter extends Voltage220V implements Voltage5VInterface {

    @Override
    public int output5V() {
        int srcOutPut = output220V();
        int dstVoltage = srcOutPut / 44;
        System.out.println("VoltageAdapter output " + dstVoltage);
        return dstVoltage;
    }
}
