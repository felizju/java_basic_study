package day13.inter;

public class BullDog extends Dog implements Pet, Huntable{

    @Override
    public void hunt() { // Huntalbe 인터페이스에 있는 메서드.
        System.out.println("불독은 이빨로 사냥함!");
    }

    @Override
    public void play() { // Pet 인터페이스에 있는 메서드, Dog 메서드 상속받음.
        System.out.println("불독은 사납게 놀아요!");
    }
}
