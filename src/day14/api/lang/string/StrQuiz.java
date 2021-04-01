package day14.api.lang.string;

import java.util.*;

public class StrQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호 : ");
        String ssn = sc.next();

        UserData userData = new UserData(ssn);
        userData.printUserInfo();

        /*System.out.println("앞자리 : "+idNo.substring(0,6));
        System.out.println("뒷자리 : "+idNo.substring(7));

        char gender = idNo.charAt(7);
        String gd = "";

        String year = idNo.substring(0,2);
        int birthYear = 0;

        if(gender==1) {
            gd = "남자";
            birthYear = 1900 + Integer.parseInt(year);
        }else if(gender==3){
            gd = "남자";
            birthYear = 2000 + Integer.parseInt(year);
        }else if(gender==2){
            gd = "여자";
            birthYear = 1900 + Integer.parseInt(year);
        }else if(gender==4){
            gd = "여자";
            birthYear = 2000 + Integer.parseInt(year);
        }

        String month = idNo.substring(2,4);
        String day = idNo.substring(4,6);

        int age = 2021 - birthYear;

        System.out.printf("%s년도 %s월 %s일생 %d세 %s",birthYear,month,day,age,gd);*/


    }
}
