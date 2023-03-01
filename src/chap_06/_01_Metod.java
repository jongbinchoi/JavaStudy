package chap_06;

public class _01_Metod {
    //메소드 = 함수(동작을 하는 코드들의 묶음)
    //static 까지 고정값 이고 뒤에 자료형 하고 메소드이름 설정, 주로 동사
   //메소드 정의
    public static void sayHello() {
        System.out.println("안녕하세요 메소드입니다.");
    }

    public static void main(String[] args) {
        //메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");

    }
}
