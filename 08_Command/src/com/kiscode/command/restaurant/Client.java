package com.kiscode.command.restaurant;

/****
 * Description: Client角色：餐厅顾客
 * Author:  keno
 * CreateDate: 2020/11/28 11:15
 */
class Client {
    public static void main(String[] args) {
        //创建 Receiver对象
        Cook cook = new Cook();
        //创建Command对象实体
        Command command = new OrderCommand(cook);

        //创建Invoker对象 持有对应Command
        Waiter waiter = new Waiter(command);

        //执行命令
        waiter.orderUp("HanBurger");
        waiter.orderUp("Cafe");
        waiter.orderUp("Milk");


    }
}
