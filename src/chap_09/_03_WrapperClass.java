package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        //래퍼 (Wrapper) 클래스
        //int double float char 기본 자료형 사용 불가

        Integer i = 123; // int i= 123;
        Double d= 1.0; // double d=1.0;
        Character c = 'A'; // char c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("----------------");

        System.out.println(i.intValue());
        System.out.println(d.intValue());//실수를 형변환 int로
        System.out.println(c.charValue());

        System.out.println("----------------");
        String s = i.toString(); // toString 매소드 정수를 문자열로 변환




    }
}
