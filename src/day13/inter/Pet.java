package day13.inter;

// 인터페이스는 모든 필드를 상수로 처리
// 기능을 명세하여 객체를 규격화 하는 것에 의도

// 추상클래스는 인스턴스필드&메서드, 정적필드&메서드, 상수, 추상메서드 모두 가질 수 있음.
// 상속을 통한 새로운 클래스 확장을 위한 의도
public interface Pet {

    // 인터페이스는 모든 필드를 상수로 처리
    String NAME = "애완동물";
    
    // 인터페이스는 모든 메서드를 추상화한다.
    void play();

    default void eat(){};
    default void fun(){};

}
