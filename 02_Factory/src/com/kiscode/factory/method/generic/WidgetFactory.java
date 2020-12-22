package com.kiscode.factory.method.generic;

/**
 * Description:
 * Author: keno
 * Date : 2020/12/22 15:20
 **/
public class WidgetFactory implements FactoryInterface<Widget> {
    @Override
    public Widget create() {
        return new Widget("");
    }
}
