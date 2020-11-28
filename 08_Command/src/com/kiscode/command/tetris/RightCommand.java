package com.kiscode.command.tetris;

/****
 * Description:向右移动命令
 * Author:  keno
 * CreateDate: 2020/11/28 10:41
 */
class RightCommand implements Command {

    private TetrisMachine tetrisMachine;

    public RightCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        tetrisMachine.toRight();
    }
}
