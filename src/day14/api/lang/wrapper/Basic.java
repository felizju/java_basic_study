package day14.api.lang.wrapper;

public class Basic {

    public int x; // 초기화 안하면 기본값 0
    public Integer y; // 초기화 안하면 기본값 null

    public static void main(String[] args) {

        // 기본 타입을 객체로 포장한 클래스들.
        // Byte, Short, Integer, Long, Float, Double, Boolean, Character

        // Object 배열에는 모든 타입이 다 들어갈 수 있음.
        int a = 10;
        // 래핑(wrapping) : boxing
        Integer i = new Integer(a);

        // auto boxing
        int j = a;

        Object[] oArr = {10, 3.3, "aaa", 'A', j};

        Basic b = new Basic();
//        System.out.println(b.x+b.y); // 0+null = NullPointerException

        // 문자열 변환
        String s1 = "90";
        String s2 = "5.11";


        try {
            int n1 = Integer.parseInt(s1);
            double n2 = Double.parseDouble(s2);
            System.out.println(n1+n2);
        } catch (NumberFormatException e) {
            System.out.println("변환할 수 없는 문자입니다.");
        }


    }
}
