package day13.api.lang.obj;

public class Main {

    public static void main(String[] args) {
        
       Member member =  new Member("김철수",30, "대전 서구");
       System.out.println(member); // member.toString() .toString() 생략되어있음.

    }
}
