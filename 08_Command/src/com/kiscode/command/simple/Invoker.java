package com.kiscode.command.simple;

/****
 * Description:
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
