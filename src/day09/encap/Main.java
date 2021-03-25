package day09.encap;

public class Main {

    public static void main(String[] args) {
        
        Cat myCat = new Cat("나비");
        myCat.setWeight(-2000);
        myCat.printWeight();


        double tripleWeight = myCat.getWeight(false);
        System.out.println("tripleWeight = " + tripleWeight);

    }
}
