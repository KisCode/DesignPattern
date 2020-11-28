package com.kiscode.command.tetris;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/28 10:41
 */
class FastToBottomCommand implements Command {
    private TetrisMachine tetrisMachine;

    public FastToBottomCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        tetrisMachine.fastToBottom();
    }
}
