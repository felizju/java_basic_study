package day10.protec.pac2;

import day10.protec.pac1.A;

// 다른 패키지인 A를 상속받은 D
public class D extends A {

    protected D(String b) {
//        super(10); // default 다른 패키지라 접근 불가능
        super("AA"); // protected 상속 받은 클래스로 접근 가능

//        this.f1 = 10; // default
        this.f2 =  22; // protected

//        m1(); // default
        m2(); // protected


    }

}
