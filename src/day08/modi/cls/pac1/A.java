package day08.modi.cls.pac1;

import day08.modi.cls.pac2.C;

// 접근제한자 자리에 아무것도 쓰지 않으면 default 제한이 걸림.
// 클래스에는 default , public 제한자만 사용 가능함. (public protected default private 중)
class A {

    public int f1;
    public int f2;

    public void m1(){
        B b = new B(); // B : public
        C c = new C(); // C : public
    }
    public void m2(){

    }
}
