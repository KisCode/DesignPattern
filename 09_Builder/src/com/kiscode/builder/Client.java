package com.kiscode.builder;

public class Client {
    public static void main(String[] args) {
       /*
       //使用Builder构建者模式模拟创建一个AlertDialog
        final AlertDialog dialog = new AlertDialog.Builder()
                .setTitle("温馨提示")
                .setMessage("您有新消息")
                .setNegtiveButton("关闭", new AlertDialog.OnClickListener() {
                    @Override
                    public void onClick() {
                        //关闭对话框
                    }
                })
                .setPostiveButton("OK", new AlertDialog.OnClickListener() {
                    @Override
                    public void onClick() {
                        //确定
                    }
                })
                .create();
        dialog.show();
        */


        //直接使用构造函数实例化对象，当构造函数的参数增加，必须修改构造函数的参数数量，代码可读性随着参数增加而下降
        Computer oldComputer =new Computer("Intel","NVIDIA","SAMSUNG 16G",3,"Lenovo","LG 23.5");

        //使用Builder构建者模式模拟创建一台计算机
        Computer computer = new Computer.Builder()
                .setCpu("Intel")
                .setGpu("NVIDIA")
                .setRam("SAMSUNG 16G")
                .setKeyboard("Lenovo")
                .setUsbCount(3)
                .setDisplay("LG 23.5")
                .build();
        System.out.println(computer.toString());
    }
}
