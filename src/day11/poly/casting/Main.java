package day11.poly.casting;

public class Main {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1();
        parent.m2();

        System.out.println("===================");

        Parent child = new Child();

        child.m1(); // 상속
        child.m2(); // 오버라이딩

        // 사용할 때만 downcasting
        ((Child) child).m3();

        System.out.println("===================");
        // 다운캐스팅은 한 번 업캐스팅 된 객체만 사용 가능함.

//        Child c = (Child) new Parent(); // 부모는 자식꺼 절대 가지고 갈 수 없음. runtime error

        Parent p = new Parent();
        if(p instanceof Child){
            Child c = (Child) p;
        }else{
            System.out.println("변환 불가능!");
        }



    }
}
