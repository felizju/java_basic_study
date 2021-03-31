package day13.inter;

public class Cat extends Animal implements Pet{

    String name;
    int age;

    public void play(){
        System.out.println("고양이는 약올리면서 놀아요!");
    }
}
