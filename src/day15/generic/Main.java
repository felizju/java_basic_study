package day15.generic;

public class Main {
    public static void main(String[] args) {


        Basket<Apple> ab = new Basket<>();
//        Basket<Apple> ab = new Basket<Apple>(); <Apple> 생략 가능
        ab.setFruit(new Apple());
        Apple fruit = ab.getFruit();
        System.out.println("fruit = " + fruit);
        System.out.println("===========================");

        Basket<Peach> pb = new Basket<Peach>();
        pb.setFruit(new Peach());
        Peach fruit1 = pb.getFruit();
        System.out.println("fruit1 = " + fruit1);
        System.out.println("===========================");

        Basket basket = new Basket(); // 제네릭 의도와는 다르므로 꼭 지정하고 사용

        basket.setFruit(new Peach());
        basket.setFruit(new Apple());
        System.out.println("===========================");

//        Basket<Water> waterBasket = new Basket<>();

        Basket<Fruit> fruitBasket = new Basket<>();
        fruitBasket.setFruit(new Peach());
        fruitBasket.setFruit(new Apple());
//        fruitBasket.setFruit(new Water());


    }
}
