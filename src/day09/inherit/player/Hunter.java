package day09.inherit.player;

public class Hunter extends Player {

    String beast;

    public Hunter(String nickName){
        super(nickName);
        this.beast = "늑대";
    }

    @Override
    void info() {
        super.info();
        System.out.println("# 동물 : "+beast);
    }

    void frozenShot(){

    }

}
