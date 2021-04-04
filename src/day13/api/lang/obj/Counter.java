package day13.api.lang.obj;

public class Counter {
    
    private int no;

    // 생성자
    public Counter(int no) {
        this.no = no;
    }
    // C++ 소멸자
/*    ~Counter(){
    }*/

/*    // python 생성자
    def __ init __(self):
    // Python 소멸자
    def __ del __(self):*/



    // finalize() 소멸자 메서드 : 객체가 메모리에서 제거되는 시점에 자동 호출 됨.
    // Object 상속되어 있기 때문에 override하여 작성
    @Override
    protected void finalize() throws Throwable {
        System.out.println(no+"번 객체 소멸됨");
    }


    public static void main(String[] args) {
        System.out.println("소멸자 테스트!");
        Counter c;
        for (int i = 0; i < 20; i++) {
            c = new Counter(i);
            c = null;
            System.gc(); // 가비지 컬렉터 : 쓰레기 객체 제거해주는 청소부 (빨리 호출)
        }
    }
}
