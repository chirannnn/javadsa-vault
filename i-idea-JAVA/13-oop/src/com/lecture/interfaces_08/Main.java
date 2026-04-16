package com.lecture.interfaces_08;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//        car.a
//        car.start();
//        car.acc();
//        car.stop();
//
//        Media carMedia = new Car();
//        carMedia.start();



        NiceCar car = new NiceCar();

        car.start();
        car.stop();
        car.startMusic();
        car.stop();
        car.upgradeEngine();
        car.start();

        ElectricEngine electricEngine = new ElectricEngine();
        NiceCar car2 = new NiceCar(electricEngine);

        car2.stop();
    }
}
