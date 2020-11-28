package com.kiscode.command.simple;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/28 10:20
 */
class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new RealCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
