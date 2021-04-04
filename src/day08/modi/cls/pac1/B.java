package day08.modi.cls.pac1;

import day08.modi.cls.pac2.C;

// 접근제한자 public 유지
public class B {

    // A와 B는 같은 패키지
    A a = new A(); // A : default

    // B와 C는 다른 패키지이지만, C의 접근제한자가 public
    C c = new C(); // C : public

}
