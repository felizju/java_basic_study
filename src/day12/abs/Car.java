package day12.abs;

// 추상 클래스
public abstract class Car { // 객체 생성 x

    private String model;
    private int price;

    public Car(String model, int price) {
        System.out.println("Car 생성자 호출!");
        this.model = model;
        this.price = price;
    }

    // 추상 메서드
    public abstract void start(); // 주행 기능 명세

    public static void staticMet(){} // 공통 기능.
    public void instanceMet(){} // 필요하면 쓰고, 없으면 쓰지말고, 바꾸려면 바꿔도 됨.
    public final void finalMet(){} // 필요하면 쓰고, 없으면 쓰지 않지만 바꾸지 않아야함.

}
