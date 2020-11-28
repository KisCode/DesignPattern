package com.kiscode.command.tetris;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/28 10:41
 */
class LeftCommand implements Command {
    private TetrisMachine tetrisMachine;

    public LeftCommand(TetrisMachine tetrisMachine) {
        this.tetrisMachine = tetrisMachine;
    }

    @Override
    public void execute() {
        tetrisMachine.toLeft();
    }
}
