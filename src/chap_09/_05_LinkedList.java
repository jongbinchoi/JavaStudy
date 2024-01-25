package chap_09;


import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        //링크드 리스트 : 사람들이 양옆으로 손을 잡고 서있음, 중간에 한명 들어갈려한다면 잡았던 손을 놓고 새로운 사람이 맞잡으면 됨.

        //리스트는 중복데이터 허용함.

        LinkedList<String> list = new LinkedList<>();

        //데이터 추가 , 이렇게 하면 마지막 데이터 다음 위치로 들어가짐
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //데이터 조회(인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());//처음 데이터
        System.out.println(list.getLast());//마지막데이터

        System.out.println("-------------");

        // 추가
        list.addFirst("서장훈"); //addFirst쓰면 유재석 위로 저장됨.
        for(String s : list){
            System.out.println(s);
        }

        System.out.println("-----------------1");
        list.addLast("김희철");
        for(String s : list){
            System.out.println(s);
        }
        System.out.println("-------------");

        System.out.println("학생 추가 전 (index 1) : "+list.get(1));
        list.add(1,"김영철"); //두번째 위치 앞에 들어가짐, 간단히 1자리에 들어가짐.
        System.out.println("학생 추가 후 (index 1): "+list.get(1));
        System.out.println("학생 추가 후 (index 2): "+list.get(2));

        //삭제
        System.out.println("남은 학생 수 (제외 전) : "+list.size());
        list.remove(list.size()-1);
        System.out.println("남은 학생 수 (제외 후) : "+list.size());

        //처음 학생과 마지막 학생이 전학
        System.out.println("남은 학생 수 (적한 전) : "+list.size());
        for(String s : list){
            System.out.println(s);
        }

        list.removeFirst(); //처음 데이터
        list.removeLast(); //마지막데이터
        System.out.println("남은 학생 수 (적한 후) : "+list.size());
        for(String s : list){
            System.out.println(s);
        }

        System.out.println("--------------");

        //변경 (수강권 양도)
        list.set(0,"이수근");
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        System.out.println("--------------확인");

        //확인
        System.out.println(list.indexOf("김종국"));
        if(list.contains("김종국")){
            System.out.println("수강신청 성공");
        }
        else{
            System.out.println("수강 신청 실패");
        }

        System.out.println("--------------");
        //전체 삭제
        list.clear();
        if(list.isEmpty()){
            System.out.println("학생 수 : "+list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("--------------");

        //새로운 학기
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        Collections.sort(list);//정렬
        for(String s : list){
            System.out.println(s);
        }
    }
}
