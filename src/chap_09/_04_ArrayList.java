package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        //컬렉션 프레임워크(List, Set , Map)


        //int[] array = new int[3];
        //array[0] = 1;
        //array[1] = 2;
        //array[2] = 3;
        //배열 경우 크기 고정이됨, 추가로 데이터를 집어넣기 위해서 새로운 배열을 만들어야함.
        // 하지만 컬렉션 프레임워크는 원하면 추가로 데이터를 만들거나 삭제가 가능함. ,탐색민 정렬 가능

        //<어떤 형태의 데이터를 저장할지>
        ArrayList<String> list = new ArrayList<>();
        //list라는 이름의 string데이터를 보관할수 있는 Arraylist가 만들어짐
        //한줄의 의자라고 생각하면됨. 그 중간에 사람이 앉을려면 그 사람 뒤에 위치사람들이 사람들이 이동해서 앉아야함.

        //데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //데이터 조회 (인덱스)
        System.out.println(list.get(0));//get이라는 매소드 사용
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("------------------");

        //삭제 (박명수 이사)
        System.out.println("신청 학생 수 (이사 전) : "+list.size());//size는 리스트 갯수 알려줌 5
        list.remove("박명수"); //remove 삭제해줌
        System.out.println("신청 학생 수 (이사 후) : "+list.size()); //4
        System.out.println(list.get(3)); //강호동


        System.out.println("------------------");
        for (String s : list) {
            System.out.println(s);

        }

        System.out.println("------------------");

        System.out.println("남은 학생 수 (제외 전) : "+ list.size()); //4
        list.remove(list.size()-1); //마지막 인덱스 삭제 하는법
        System.out.println("남은 학생 수 (제외 후) : "+ list.size());//3

        System.out.println("------------------");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------------------");

        //변경 (수강권 양도)
        System.out.println("수강권 양도 전 : " +list.get(0));
        list.set(0, "이수근"); //set은 위치변경 변경할 위치 와 변경할것
        System.out.println("수강권 양도 후 : " +list.get(0));

        System.out.println("------------------");

        //확인
        System.out.println(list.indexOf("김종국")); //indexOf몇번째 있는지 찾게해줌
        //선착순 5명 내에 포함되었는가?
        if(list.contains("김종국")){ //contains포홤되었는지 확인
            System.out.println("수강 신청 성공");
        }
        else{
            System.out.println("수강 신청 실패");
        }
        System.out.println("------------------");

        //전체 삭제
        list.clear(); //clear삭제
        if(list.isEmpty()){ //isEmpty를 확인해서 정말 비어있는 지 확인
            System.out.println("학생 수 : "+list.size());
            System.out.println("리스트가 비었습니다.");
        }
        System.out.println("------------------");

        //다음 학기이ㅔ 새로 공부 시작
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //정렬
        Collections.sort(list);//Collections. sort(정렬하고싶은데이터) 넣으면됨.

        for (String s: list) {
            System.out.println(s);
        }
    }




}