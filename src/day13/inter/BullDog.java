package day13.inter;

public class BullDog extends Dog implements Pet, Huntable{

    @Override
    public void hunt() {
        System.out.println("불독은 이빨로 사냥함!");
    }

}
