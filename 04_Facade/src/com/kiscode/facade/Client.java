package com.kiscode.facade;

/****
 * Description: Facade 外观模式（门面模式）
 *
 * Author:  keno
 * CreateDate: 2020/11/24 21:29
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.test();
    }
}
