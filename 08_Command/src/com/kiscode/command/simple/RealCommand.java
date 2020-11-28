package com.kiscode.command.simple;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/28 10:22
 */
class RealCommand implements Command {
    private Receiver receiver;

    public RealCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.execute();
    }
}
