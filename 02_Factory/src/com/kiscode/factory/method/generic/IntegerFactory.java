package com.kiscode.factory.method.generic;

/**
 * Description:
 * Author: keno
 * Date : 2020/12/22 15:19
 **/
public class IntegerFactory implements FactoryInterface<Integer> {
    @Override
    public Integer create() {
        return Integer.valueOf(0);
    }
}
