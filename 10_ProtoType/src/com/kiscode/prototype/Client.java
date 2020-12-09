package com.kiscode.prototype;

/**
 * Description:
 * Author: keno
 * Date : 2020/12/9 8:31
 **/
public class Client {
    public static void main(String[] args) {
//        shallowCopySheep();

        deepCopyDog();


    }


    private static void shallowCopySheep() {
        Sheep originalSheep = new Sheep(1, "Meme", "WHITE");
        System.out.println("originalSheep is :" + originalSheep.toString());


        try {
            Sheep cloneSheep1 = (Sheep) originalSheep.clone();
            cloneSheep1.setName("Clone Sheep No.1");
            System.out.println("cloneSheep1 is :" + cloneSheep1.toString());


            Sheep cloneSheep2 = (Sheep) originalSheep.clone();
            cloneSheep2.setName("Clone Sheep No.2");
            cloneSheep2.setAge(2);
            cloneSheep2.setColor("GRAY");
            System.out.println("cloneSheep2 is :" + cloneSheep2.toString());

            System.out.println("---------------------");

            System.out.println("originalSheep is :" + originalSheep.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }


    private static void deepCopyDog() {
        Address address = new Address("NewYork", "Center Street 10");
        Dog dog = new Dog(1, "WangWang", "Black", address);
        System.out.println(dog);

        System.out.println("---------------------");
        try {
            Dog cloneDog1 = dog.clone();
            cloneDog1.getAddress().setCity("MAMI");
            System.out.println("cloneDog is:" + cloneDog1);

            System.out.println("original dog is:" + dog);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
