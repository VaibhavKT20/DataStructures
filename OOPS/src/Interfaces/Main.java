package Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car=new Car();
//        car.accelerate();
//        car.start();
//        car.stop();
//
//        System.out.println();
//
//        Media carMedia=new Car();
//        carMedia.start();
//        carMedia.stop();

        NiceCar car=new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();



    }
}
