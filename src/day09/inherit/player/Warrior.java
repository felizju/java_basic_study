package day09.inherit.player;

// 상위 클래스로부터 상속받은 클래스를 자식, 하위 클래스 (sub class)라고 부름.
// 상속은 is - a 관계를 만족함.
public class Warrior extends Player {

    int rage;

    public Warrior(String nickName){
//        super(); // 생략되어있음. 부모 생성자 호출문 super();
//        this.nickName = nickName;
        super(nickName);
        this.rage = 60;
    }

    @Override // 오버라이딩 룰을 위반했는지 확인 - 틀은 유지하고 내부만 변경 가능함.
    public void info() {
        super.info();
        System.out.println("# 분노 : "+rage);
    }

    public void fireSlash(Player target){

        System.out.printf("%s님이 %s님에게 FireSlash를 시전했습니다!\n"
                ,this.getNickName(), target.getNickName());

        String jobName;
        int damage;

        if(target instanceof Warrior){
            damage = 10;
            jobName = "전사";

        }else if(target instanceof Mage){
            damage = 20;
            jobName = "마법사";

        }else if(target instanceof Hunter){
            damage = 30;
            jobName = "사냥꾼";

        }else{
            damage = 0;
            jobName = "미확인";
        }
        target.hp -= damage;
        System.out.printf("%s(%s)님이 %d의 피해를 입었습니다.\n"
                ,target.getNickName(), jobName, damage);
        System.out.printf("%s님의 현재 체력 : %d\n"
                ,target.getNickName(), target.hp);
        System.out.println();


    }

}
