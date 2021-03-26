package day09.encap;

public class Car {

    // 주행기능
    public void drive(){
        // 1. 시동켜야함
        powerOn();
        // 2. 기어 D
        changeGear("D");
        // 3. 악셀
        accel();
    }

    // 시동켜는 기능
    private void powerOn(){}
    // 기어변속 기능
    private void changeGear(String gearType){}
    // 악셀링 기능
    private void accel(){}

}
