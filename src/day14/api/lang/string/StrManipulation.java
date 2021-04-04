package day14.api.lang.string;

import java.util.Arrays;

public class StrManipulation {
    public static void main(String[] args) {

        String str = "hello java";

        // charAt(idx) : 문자열 인덱스에 따른 글자를 반환
        char c = str.charAt(3);
        System.out.println("c = " + c);
        
        // substring() : 문자열의 특정 범위를 추출
        // python str[6:]
        String ss1 = str.substring(6); // 6번부터 끝까지 추출
        System.out.println("ss1 = " + ss1);
        // python str[0:5]
        String ss2 = str.substring(0, 5);// 0번부터 5번 미만까지 추출
        System.out.println("ss2 = " + ss2);

        // length() : 문자열의 총 길이
        int length = str.length();
        System.out.println("length = " + length);

        // indexOf(), lastIndexOf() : 특정 문자나 단어의 첫글자 위치를 반환
        int first = str.indexOf("l"); // 앞에서 부터 검색
        int last = str.lastIndexOf("l"); // 뒤에서 부터 검색
        System.out.println("first = " + first);
        System.out.println("last = " + last);

        // 찾는 단어가 포함되어 있다면 그 첫글자 인덱스 반환
        // 없다면 -1 반환
        int java = str.indexOf("jara");
        System.out.println("java = " + java); // j 인덱스 반환

        // 대소문자 변환
        // .toLowerCase() 모두 소문자로 변환
        // .toUpperCase() 모두 대문자로 변환
        String str2 = "HeLLo PoRORO";
        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());

        System.out.println("====================================");

        String fileName = "/local/img/'2021/04/01/개구쟁이뽀로로.JPG";
        
        // 파일 확장자가 JPG , GIF , PNG , SVG 면 이미지로 판별
        String ext = fileName.substring(fileName.indexOf(".")+1);
        System.out.println("ext = " + ext);

        switch (ext.toUpperCase()){
            case "JPG": case "GIF": case "PNG": case "SVG":
                System.out.println("이미지 파일임!");
                break;
            default:
                System.out.println("기타 파일임!");
        }
        
        String phone = "010-6565-9292";
        
        String lastNumber = phone.substring(phone.lastIndexOf("-")+1);
        System.out.println("lastNumber = " + lastNumber);

        // trim() : 문자열의 앞 뒤 공백 제거
        String name = "              김철수 ";
        System.out.println("이름 : "+name.trim());

        // replace(old, new) : 문자열 내부에 있는 old 문자를 찾아 new 문자로 변경
        String msg = "java study, java program, java coffee";
        System.out.println(msg.replace("java","자바"));
        System.out.println(msg.replace("java",""));

        // split(구분 문자) : 구분 문자를 기준으로 분리하여 String 배열에 리턴
        String pet = "멍멍이, 야옹이, 짹짹이, 어흥이";
        String[] split = pet.split(",");
        for (String s : split) {
            System.out.println(s.trim());
        }

        System.out.println("====================================");

        int userNum = 130;
        String userName = "박영희";
        String address = "대전 서구";

        // String.valueOf() : 다른 타입 데이터를 문자열로 변경.
        String[] userDatas = {String.valueOf(userNum), userName, address};
        System.out.println(Arrays.toString(userDatas));




    }
}
