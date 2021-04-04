package day15.generic;

// 제네릭 타입 F
public class Basket<F extends Fruit>{ // extends로 과일만 들어올 수 있도록 제한해두기.

    // 과일 필드
    private F fruit;

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }

    public F getFruit() {
        return fruit;
    }

}
