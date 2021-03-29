package day11.poly.car;

import day10.protec.pac1.B;

public class Main {

    public static void main(String[] args) {

/*      
        // 다형성 특징
        // 1. 객체 교환성 증가
        Car myCar = new Car();

        myCar.frontLeft = new NexenTire();
        myCar.frontRight = new KumhoTire();*/

        // 2. 다른 타입간 배열 구성 가능 (이종 모음 배열)
        // 자동 캐스팅 되어 Car 에 들어감.
        Tusan t1 = new Tusan();
        Tusan t2 = new Tusan();
        Tusan t3 = new Tusan();
        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();
        Boxter b1 = new Boxter();
        Boxter b2 = new Boxter();
        Boxter b3 = new Boxter();

/*
        Car[] cars = {t1, t2, t3, s1, s2, s3, b1, b2, b3};
        for (Car car : cars) {
            car.run(); // 각 오버라이딩 된 것에 맞게 실행됨.
        }*/

        Driver driver = new Driver();

        driver.drive(new Sonata());
        driver.drive(new Tusan());
        driver.drive(new Boxter());

        System.out.println("======================");

//        Car myCar = driver.buyCar("소나타");
        Sonata myCar = (Sonata) driver.buyCar("소나타");
        driver.drive(myCar);

//        myCar.joinMembership(); // 타입이 Sonata가 아니라 Car이기 때문에 사용할 수 없음.
//        ((Sonata) myCar).joinMembership(); // downcasting

        myCar.joinMembership();
        Car[] cars2 = {myCar};

        System.out.println("======================");
        CarShop shop = new CarShop();
        shop.sellCar(new Tusan());


        "".equals(t2);
    }
}
