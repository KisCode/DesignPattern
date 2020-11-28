package com.kiscode.command.remote;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/28 11:39
 */
interface Command {
    //执行命令
    void execute();

    //取消命令 撤销上一步execute
    void undo();
}
