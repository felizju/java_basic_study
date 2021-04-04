package day10.final_;

class Child extends Parent {

    @Override
    void m2() {
        super.m2();
    }
//    void m1(){
//
//    }
}

// final 붙은 메서드는 오버라이드 할 수 없다.
public class Parent {

    final void m1(){}
    void m2(){}


}
