package com.kiscode.command.tetris;

/**** 
 * Description: 俄罗斯方块具体实现类
 * 命令模式中的 Receiver角色
 * Author:  keno
 * CreateDate: 2020/11/28 10:37
 */
class TetrisMachine {
    public void toLeft() {
        System.out.println("TetrisMachine to left");
    }

    public void toRight() {
        System.out.println("TetrisMachine to right");
    }

    public void fastToBottom() {
        System.out.println("TetrisMachine fast to bottom");
    }

    public void transform() {
        System.out.println("TetrisMachine to transform");
    }
}
