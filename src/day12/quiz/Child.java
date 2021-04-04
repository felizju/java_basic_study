package day12.quiz;

public class Child extends Parent{

    public Child(String name) {
        super(name); // 상속 받았으니 super() 생략되어 있다는 것을 알아야 함.
                     // 하지만 부모 클래스인 Parent에 기본 생성자가 없으므로 String이 들어간 생성자로 불러줘야 함.
        this.name = name;
    }
}
