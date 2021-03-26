package day09.inherit.quiz;

public class Child extends Parent {

    private String name;
    public Child(){
        this("홍길동");
        System.out.println("Child() call");
    }
    public Child(String name){
        super(); // 생략
        this.name = name;
        System.out.println("Child(String) call");
    }
}
