package day09.inherit.player;

public class Berserker extends Warrior{

    String sword;

    public Berserker(String nickName) {
        super(nickName);
        this.sword = "양날의 검";
    }

    @Override
    public void info() {
        super.info();
        System.out.println("# 검 :"+sword);
    }

}
