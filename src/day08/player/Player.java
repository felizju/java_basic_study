package day08.player;

public class Player {

    // 필드
    String name;
    int level;
    int hp;

    // 생성자
    Player(){
        // this(), super() : 반드시 생성자 맨 첫 라인에 기술.
        this("이름없음", 1); // 3번 생성자 호출
        System.out.println("1번 생성자 호출!");

//        this.name = "이름없음";
//        this.level = 1;
//        this.hp = this.level * 50;
    }

    Player(String name){
//    Player(Player this, String name){

        this(name, 1 ); // 나의 다른 생성자를 연계 호출함.
                             // 3번 생성자 호출
        System.out.println("2번 생성자 호출!");

        // 필드와 지역변수 (매개변수) 이름이 같을 경우. - 필드에 this 붙여줌.
//        this.name = name;
//        this.level = 1;
//        this.hp = this.level * 50;
    }

    Player(String name, int level){
        System.out.println("3번 생성자 호출!");
        this.name = name;
        this.level = level;
        this.hp = this.level * 50;
    }


    // 메서드
    void attack(Player target){
//    void attack(Player this, Player target){  - Player this 생략되어 있음.

        System.out.printf("%s가 %s를 공격합니다.\n", this.name, target.name);

//        System.out.println("=========================================");
//        System.out.println("target의 주소 값 = " + target); // 상대방
//        System.out.println("this의 주소 값 ="+this); // this = 나
//
//        System.out.println("맞은 플레이어 이름 = " + target.name);
//        System.out.println("때린 플레이어 이름 = " + this.name);
    }

    void info(){
        System.out.printf("이름 : %s, 레벨 : %d, 체력 : %d\n", this.name, this.level, this.hp);
    }


}
