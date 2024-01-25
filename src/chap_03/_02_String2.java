package chap_03;

import java.sql.SQLOutput;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //문자열 변환
        System.out.println(s.replace(" and",","));
        // "and"를 ","로 변환 , 형태->s.replace("변경하기전", "변경후")
        System.out.println(s.substring(7)); //인덱스 기준 7부터 시작 (이전 내용은 삭제)
        System.out.println(s.substring(s.indexOf("Java")));//먼저 위치값을 파악한 후에 그 기준으로 짤라냄
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));
        //시작 위치부터 끝 위치 "직전", "Java"가 시작하는 위치부터, "."이 시작하는 위치 바로 앞까지

        // 공백 제거
        s= "        I love Jave.     ";
        System.out.println(s);
        System.out.println(s.trim()); //앞 뒤 공백 제거

        //문자열 결합
        String s1= "Java";
        String s2= "Python";
        System.out.println(s1+s2);
        System.out.println(s1+","+s2);
        System.out.println(s1.concat(",").concat(s2)); //여러가지가 들어갈때 , 공백 등등
    }
}
//trim공백제거
//substring 위치부터 시작
//concat는 공백에 뭘 넣을 지