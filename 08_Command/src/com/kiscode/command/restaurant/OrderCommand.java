package com.kiscode.command.restaurant;

/****
 * Description:订单命令
 * Author:  keno
 * CreateDate: 2020/11/28 11:20
 */
class OrderCommand implements Command {
    private Cook cook;

    public OrderCommand(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void order(String menuName) {
        cook.cooking(menuName);

    }
}
