package day07;

// 실행용 클래스는 main 메서드를 포함.
public class PhoneMain {

    // 설계된 것을 호출하여 사용
    public static void main(String[] args) {

        // 객체의 생성
        // 데이터타입 = 사용자정의타입 (클래스명)
        Phone galaxyS20 = new Phone();
        // Phone(); --> 생성자

        // 객체의 속성과 기능을 참조 : 참조연산자 . 을 사용함.
        galaxyS20.showSpec();

        System.out.println("========================");
        Phone iPhoneX = new Phone("아이폰X");
        iPhoneX.showSpec();


        System.out.println("========================");
        Phone LgV6 = new Phone("엘지V6","에메랄드 그린");
        LgV6.showSpec();

        galaxyS20.powerOff();
        iPhoneX.powerOff();
        galaxyS20.powerOn();
        iPhoneX.powerOn();
        galaxyS20.sendMessage(iPhoneX,"야 밥 ㄱㄱ");
        iPhoneX.checkMessages();
        iPhoneX.sendMessage(galaxyS20,"ㅇㅇ");
        galaxyS20.checkMessages();

        galaxyS20.sendMessage(iPhoneX,"야");
        galaxyS20.sendMessage(iPhoneX,"밥");
        galaxyS20.sendMessage(iPhoneX,"먹");
        galaxyS20.sendMessage(iPhoneX,"었");
        galaxyS20.sendMessage(iPhoneX,"냐");

        iPhoneX.checkMessages();

        iPhoneX.sendMessage(LgV6, "하이");
        LgV6.checkMessages();
    }

}
