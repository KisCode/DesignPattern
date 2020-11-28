package com.kiscode.command.restaurant;

/****
 * Description: Invoker角色：餐厅服务员
 * Author:  keno
 * CreateDate: 2020/11/28 11:14
 */
class Waiter {
    private Command order;

    public Waiter(Command order) {
        this.order = order;
    }

    public void orderUp(String menuName) {
        order.order(menuName);
    }
}
