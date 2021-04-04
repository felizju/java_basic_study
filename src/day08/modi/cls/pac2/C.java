package day08.modi.cls.pac2;

import day08.modi.cls.pac1.B;
//import day08.modi.cls.pac1.A;

public class C {

    // A와 B클래스 모두 다른 패키지이지만, B는 public
    B b = new B(); // B : public

    // A는 default이기 때문에, 참조 불가능.
//    A a = new A(); // A : default - 다른 패키지에서 참조 불가능.

}
