package com.kiscode.command.simple;

/****
 * Description: 命令
 * Author:  keno
 * CreateDate: 2020/11/28 10:22
 */
class RealCommand implements Command {
    //持有具体接受者引用
    private Receiver receiver;

    public RealCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //命令具体实现最终由接受者完成
        receiver.execute();
    }
}
