package day11.player;

import day09.inherit.player.Hunter;
import day09.inherit.player.Mage;
import day09.inherit.player.Warrior;

public class Main {

    public static void main(String[] args) {

        Warrior w = new Warrior("봉사왕김파괴");
        Mage m = new Mage("메티오킹불바다");
        Hunter h = new Hunter("멍멍이는내친구");

        // 타겟된 플레이어들은 10~15 의 랜덤 피해를 입고,
        // 실제 hp에 반영되어야 하며, 자기 자신은 피해를 입지 않아야 함.
        m.meteo(w, h);
        System.out.println("=================");

        m.meteo(h, m, new Warrior("말썽쟁이전사"),
                new Mage("블리자드왕눈보라"));

        System.out.println("=================");
        w.fireSlash(new Warrior("말썽꾸러기"));
        w.fireSlash(m);
        w.fireSlash(h);

    }

}
