package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "java";
        String s2="Python";

        System.out.println(s1.equals("Java"));// 문자열 내용이 같으면 참, 다르면 거짓
        System.out.println(s2.equalsIgnoreCase("python"));
        //대소문자 구분 없이 문자열 내용이 같은 지 여부 체크

        //문자열 비교 심화
        s1= "1234";//벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2= "1234"; //s1과 s2은 같은 메로리를 참조
        System.out.println(s1.equals(s2));//true(내용)
        System.out.println(s1==s2);//true

        s1 = new String("1234"); // String s1= "1234" 표시 할수 있는 다른방식
        s2 = new String("1234");
        //s1과 s2 는 다른 곳에 데이터가 저장됨. 여러메모지를 주는거임.
        System.out.println(s1.equals(s2));//true
        System.out.println(s1 == s2); //false


        //자바에서 문자열 내용을 비교하고싶을 때는 equals를  사용!! 기억해라

    }
}
