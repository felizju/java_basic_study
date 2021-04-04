package day10.static_;

public class Count {

    public int x; // 인스턴스 필드 (instance field)
    public static int y; // 정적 필드 (static field)

    // 인스턴스 메서드
    public void method1(){
        int z = this.x + y;
        System.out.println("z(instance) = " + z);
    }

    // 정적 메서드
    public static void method2(Count c){
        // static 블록 내에서는 인스턴스 멤버를 직접 사용할 수 없음.
//        int z = this.x + y;
//        this.method1();

        // 누구 것을 쓰는지 알려줘야 함.
        // this가 어떤 것인지 static은 알 수 없음.
        int z = c.x + y;
        c.method1();

    }

}
