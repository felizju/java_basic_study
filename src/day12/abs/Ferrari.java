package day12.abs;

public class Ferrari extends Car{

    public Ferrari(String model, int price) {
        super(model, price);
    }

    @Override
    public void start() {
        System.out.println("페라리가 출발합니다.");
    }
}
