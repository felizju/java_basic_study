package day09.inherit.player;

// 공통 속성과 기능을 가진 클래스를 부모, 상위 클래스(super class)라고 부름.
// 모든 클래스의 조상 (root class)는 Object 임.
public class Player extends Object{

    // 공통 필드
    private String nickName;
    int level;
    int hp;


    // 생성자
    public Player(String nickName){
        System.out.println("플레이어 생성자 호출!!");
        this.nickName = nickName;
        this.level = 1;
        this.hp = level * 50;
    }


    // 공통 메서드
    void attack(){
        System.out.printf("%s님이 공격합니다.\n", this.nickName);
    }

    public void info(){
        System.out.println("===========================");
        System.out.println("# 캐릭터명 : "+nickName);
        System.out.println("# 레벨 : "+level);
        System.out.println("# 체력 : "+hp);
    }

    // getter
    public String getNickName() {
        return nickName;
    }
}
