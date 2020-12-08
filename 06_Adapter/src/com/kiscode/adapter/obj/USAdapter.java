package com.kiscode.adapter.obj;

/**
 * Description: 对象适配器
 *
 * <p>
 * 1. 适配器通过实现目标接口
 * 2. 持有被适配对象实例adaptee，在构造函数中初始化
 * 3. 在目标接口方法中对adaptee进行适配
 * </p>
 * Author: keno
 * Date : 2020/12/8 8:29
 **/
public class USAdapter implements USATarget {
    private ChineseVoltage adaptee;

    public USAdapter(ChineseVoltage adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int output110V() {
        int srcVoltage = adaptee.output220V();
        int dstVoltage = srcVoltage / 2;
        System.out.println("USAdapter output " + dstVoltage);
        return dstVoltage;
    }
}
