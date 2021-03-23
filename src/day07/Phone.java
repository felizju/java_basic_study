package day07;

// 설계도 클래스는 main을 만들지 않음.
public class Phone {

    // 속성 : 객체의 데이터
    // 필드 (field) : 구체적 설정 안함.
    String model;
    String color;
    int price;
    String[] receiveMessages; // 문자메시지들
    int messageCount; // 총 문자메시지 수
    boolean isOn; // 전원 여부


    // 생성자 선언 --> 객체의 초기화를 담당함
    // 자바가 자동으로 생성
    Phone(){ // 무조건 void 이기 때문에 리턴 타입 생략
        model = "갤럭시S20";
        color = "블랙";
        price = 1000000;
        isOn = true;
        receiveMessages = new String[3];
    }
    Phone(String customModel){
        model  = customModel;
        color = "스노우 화이트";
        price = 1200000;
        isOn = true;
        receiveMessages = new String[5];
    }
    Phone(String customModel, String customColor){
        model = customModel;
        color = customColor;
        price = 1500000;
        isOn = true;
        receiveMessages = new String[10];
    }



    // 기능 : 객체의 행위
    // 메서드 (method) : static 붙이지 않기.

    // 전원 켜는 기능
    void powerOn(){
        isOn = true;
        System.out.println(model+"의 전원을 켭니다.");
    }
    // 전원 끄는 기능
    void powerOff(){
        isOn = false;
        System.out.println(model+"의 전원을 끕니다.");
    }

    // 핸드폰 정보를 보여주는 기능
    void showSpec(){
        if(!isOn){
            System.out.println("전원을 먼저 켜세요!");
            return;
        }
        System.out.println("\n** 휴대폰의 정보 **");
        System.out.println("# 모델명 : " + model);
        System.out.println("# 색상 : " + color);
        System.out.println("# 가격 : " + price+"원");
    }

    // 문자 보내는 기능
    void sendMessage(Phone targetPhone, String message) {
        if (!targetPhone.isOn) {
            System.out.printf("%s의 전원이 꺼져있습니다.\n", targetPhone.model);
            return;
        }
        if (!isOn) {
            System.out.printf("%s의 전원을 먼저 켜세요.\n", model);
            return;
        }
        if (targetPhone.messageCount < targetPhone.receiveMessages.length) {
            
            // targetPhone의 메시지함[cnt]에 저장
            targetPhone.receiveMessages[targetPhone.messageCount++] = message;
            System.out.println("메시지를 성공적으로 보냈습니다.");
        } else {
            System.out.println("상대방의 메시지함이 다 찼습니다.");
        }
    }

    //수신메시지함을 확인하는 기능
    void checkMessages() {
        System.out.printf("\n===== [%s]의 메시지함 =====\n", model);
        for (int i = 0; i < messageCount; i++) {
            System.out.printf("# %d. %s\n", i+1, receiveMessages[i]);
        }
    }



}
