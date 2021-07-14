public class Circle { //Circle 클래스

    double radius; //반지름
    String name; //이름

    public static void main(String[] args) { //start main
        //pizza 객체
        Circle pizza = new Circle( 5);

        //원주율 3.14
        final double PI = 3.14;

        //원 면적 = pi * (반지름^2)
        System.out.println("면적 = " + PI * Math.pow((pizza.radius),2));
    }//end main


    public Circle(double radius) {//circle 생성자
        this.radius = (double) radius;
    }

}//end class

