package com.kiscode.command.remote;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/28 11:45
 */
class RemoteControlLoader {
    public static void main(String[] args) {
        //创建Receiver对象
        Tv tv = new Tv();
        Light light = new Light();
        AirConditioner airConditioner = new AirConditioner();

        //创建命令
        Command tvOnCommand = new TvOnCommand(tv);
        Command tvOffCommand = new TvOffCommand(tv);
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        //创建invoker对象
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, tvOnCommand);
        remoteControl.setCommand(1, tvOffCommand);
        remoteControl.setCommand(2, lightOnCommand);
        remoteControl.setCommand(3, lightOffCommand);

        //执行命令
        remoteControl.pressButton(0);
        remoteControl.pressButton(1);
        remoteControl.pressButton(2);
        remoteControl.pressButton(3);
        remoteControl.pressUndo();
    }
}
