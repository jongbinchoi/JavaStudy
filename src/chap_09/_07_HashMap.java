package chap_09;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        //맵 (key, Value)
        //해쉬맵 순서보장 X , 중복 허용X
        HashMap<String, Integer> map = new LinkedHashMap<>();//HashMap<k,v>키를 통해 값을 가져오거나 설정
        //Linked쓰면 순서대로 변함, import 확인


        //데이터 추가
        map.put("유재석",10); //유재석이라는 키, 사물함안에 10이 들어있음
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        System.out.println("총 고객 수 : "+map.size()); //3
        System.out.println("--------------");

        //조회
        System.out.println("유재석님의 포인트 : "+map.get("유재석")); //get안에 키값넣어야함. 그럼 값을 얻을수있음
        System.out.println("박명수님의 포인트 : "+map.get("박명수"));
        System.out.println("--------------");

        //확인
        if(map.containsKey("서장훈")){ //서장훈 포함됨? 묻는 질문
            int point = map.get("서장훈"); //get을 통해 서장훈 키의 값을 포인트에 대입
            map.put("서장훈",++point);
            System.out.println("서장훈님의 누적 포인트 : "+map.get("서장훈"));
        }
        else{
            map.put("서장훈", 1);
            System.out.println("서장훈님 신규 등록 (포인트 1)");
        }
        System.out.println("--------------------");

        //삭제
        map.remove("유재석");
        System.out.println(map.get("유재석"));
        System.out.println("-------------------");

        //전체 삭제
        map.clear();
        if(map.isEmpty()){
            System.out.println("남은 고객 수 : "+ map.size());
            System.out.println("가게 접자");
        }
        System.out.println("------------------");

        //다시 고객 찾아옴
        map.put("유재석",10); //유재석이라는 키, 사물함안에 10이 들어있음
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        //key확인
        for(String key : map.keySet()){
            System.out.println(key);
        }
        System.out.println("---------------");

        //Value 확인
        for(int value : map.values()){
            System.out.println(value);
        }
        System.out.println("---------------");

        //key, value함께 확인
        for(String key : map.keySet()){
            System.out.println("고객 이름 : "+key +" \t포인트 : "+map.get(key));
        }
        System.out.println("---------------");

        //맵 : 중복x , 순서x
        map.put("김종국",10);
        map.put("김종국",30);
        map.put("김종국",50); //최종적으로 업데이트된 값
        for(String key : map.keySet()){
            System.out.println("고객 이름 : "+key +" \t포인트 : "+map.get(key));
        }
        System.out.println("---------------");
    }
}
