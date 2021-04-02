package day15.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Member {
    String name;
    int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class MapExample {
    public static void main(String[] args) {

        // Map : key, value 의 쌍으로 데이터를 집합관리
        //       key 는 중복이 불가능, value 는 중복 가능
        Map<String, Member> memberMap = new HashMap<>();

        // map 에 객체 추가 : put(key, value)
        memberMap.put("멍멍이", new Member("김철수",30));
        memberMap.put("야옹이", new Member("고길동",45));
        memberMap.put("짹짹이", new Member("박영희",35));
        System.out.println(memberMap);

        // 이미 저장된 key 로 새롭게 put 하면 value 가 수정됨 (조심)
        memberMap.put("야옹이", new Member("둘리",10));
        System.out.println(memberMap);

        System.out.println("memberMap.Size() = " + memberMap.size());

        // map 에 저장된 객체 참조 : get(key)
        Member kim = memberMap.get("멍멍이"); // key 입력하면 value 반환
        System.out.println("kim = " + kim.name);

        // map 에 저장된 key 의 유무 확인
        boolean contains = memberMap.containsKey("야옹이");
        System.out.println("contains = " + contains);

        // map 내부 객체 삭제 : remove(key)
        memberMap.remove("멍멍이");
        System.out.println(memberMap);
        System.out.println("memberMap.Size() = " + memberMap.size());

        System.out.println("===================================");

        // map 반복문 처리
        // map 은 keySet() 메서드는 저장된 key 만 추출하여 Set 컬렉션에 담아 리턴.
        Set<String> keys = memberMap.keySet();
        System.out.println(keys);

        for (String key : keys) {
            System.out.println(memberMap.get(key));
        }

    }
}
