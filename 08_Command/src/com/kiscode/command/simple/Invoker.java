package com.kiscode.command.simple;

/****
 * Description: Invoker命令触发者
 * 包含一个成员变量持有命令对象的引用。触发命令 而不向接受者直接发送请求
 * Author:  keno
 * CreateDate: 2020/11/28 10:20
 */
class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
