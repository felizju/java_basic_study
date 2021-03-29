package day11.poly.car;

public class Driver {

/*    void drive(Sonata s){
        System.out.println("운전을 시작합니다.");
        s.run();
    }
    void drive(Tusan t){
        System.out.println("운전을 시작합니다.");
        t.run();
    }
    void drive(Boxter b){
        System.out.println("운전을 시작합니다.");
        b.run();
    }*/


    // 매개변수의 다형성
    void drive(Car c){ // xx.drive(new Sonata());
        System.out.println("운전을 시작합니다.");
        c.run();
    }


    // 리턴 타입의 다형성
    Car buyCar(String carName){

        if(carName.equals("투싼")){
            System.out.println("투싼을 구매합니다.");
            return new Tusan();
        }else if(carName.equals("쏘나타")){
            System.out.println("쏘나타을 구매합니다.");
            return new Sonata();
        }else if(carName.equals("박스터")){
            System.out.println("박스터을 구매합니다.");
            return new Boxter();
        }else{
            System.out.println("해당 차량은 없습니다.");
            return null;
        }
    }


}
