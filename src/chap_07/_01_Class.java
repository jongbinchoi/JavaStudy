package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        //객체 지향 프로그래밍 (OOP : Object=Oriented Programming)
        // 유지보수 이용
        // 높은 재사용성

        //차량용 블랙박스
        //모델명, 해상도, 가격 ,색상
        String modeName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";

        String modeName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 3000000;
        String color2 = "화이트";

        //또다른 제품을 개발? 변수가 무수히 많아짐 하지만 자료형은 다름 이럴때 비슷한 것끼리 묶는 클래스사용
        BlackBox bbox = new BlackBox(); // 클래스 객체이름 = new 클래쓰();
        //blackbox 클래스로 부터 bbox 객체 생성
        //bbox 객체는 blackbox 클래스의 인스턴스
        //BlackBox를 설계도라고 생각하고 bbox를 결과물

        BlackBox bbox2 = new BlackBox();
    }
}
