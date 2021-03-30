package day12.abs;

public class Driver {

    Car myCar;

    // 생성자
    public Driver(Car myCar) {
        this.myCar = myCar;
    }

    public void drive(){
        myCar.start();
    }

}
