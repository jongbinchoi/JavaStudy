package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        //이터레이터 ,글자 하나하나 확인하는 방식임 ->불필요하거나 삭제하고싶은 것을 중간에 가능함.

        List<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("알 수 없음");
        list.add("김종국");
        list.add("알 수 없음");
        list.add("강호동");
        list.add("알 수 없음");
        list.add("박명수");
        list.add("알 수 없음");
        list.add("조세호");

        for (String s: list) {
            System.out.println(s);
        }
        System.out.println("----------------");

        Iterator<String> it = list.iterator();
        //ctrl+alt+v 반환형을 자동으로 만들어줌
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("----------------hasNext");
        it = list.iterator();
        //다시 쓰는 이유는 위에 next로 인해 커서가 4번째 있는 것을 다시 커서를 처음으로 이동하기위해 쓰임

        while (it.hasNext()) {// 다음 가져올 데이터가 있는지 질문하는 것
            System.out.println(it.next());
        }
        System.out.println("----------------");

        it = list.iterator();
        while(it.hasNext()){
            String s = it.next(); //현재 커서가 있는 위치부터 그다음데이터를 스트링으로 받음
            if(s.contains("알 수 없음")){
                it.remove();
            }
        }
        it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("----------------");
        //HasSet은 중복불가
        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator<String> itSet = set.iterator();
        while(itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("----------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석",10);
        map.put("박명수",5);

        //map.iterator() 맵은 이터레이터 안됨.
        Iterator<String> itMapkey = map.keySet().iterator();
        while(itMapkey.hasNext()) {
            System.out.println(itMapkey.next());
        }
        System.out.println("----------------");

        Iterator<Integer> itMapValue = map.values().iterator();
        while(itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }
        System.out.println("----------------");


        //entrySet은 키값하고 값을 둘다 사용할수 있음 아래 형태 기억
        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while(itMap.hasNext()){
            System.out.println(itMap.next());
        }
    }
}
