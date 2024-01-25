package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        //객체 KRWConverter 변수 converter
        KRWConverter converter = new KRWConverter();
        // converter.convert(1);

        //convertUSD((USD)-> System.out.println(USD+"달러 = "+(USD*1400)+"원"),1);


        //함수형 인터페이스 , 인터페이스에는 오직하나의 추상메소드 1개만 존재해야함.
        Convertible convertible =(USD)-> System.out.println(USD+"달러 = "+(USD*1400)+"원");
        convertUSD(convertible,2);


        //위 동작을 메소드로 옮긴것 뿐
        //동작 순서-converusd 호출-전달값은 위 변수converter,2값이
        //아래 매개변수 값에 저장됨. 아래 매소드에서 각값이 집어넣어서 convert클래스 호출됨.
        //사용설명서는 KRWConverter이기때문에 저기에서 발동됨.

        //전달값이 하나도 없다면?
        //객체 c1
        //전달값이 없다()
        ConvertibleWithNoParams c1 = ()-> System.out.println("1 달러 = 1400 원");
        c1.convert();

        //두 줄 이상의 코드가 있다면?
        c1 = ()->{
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD+"달러 = "+(USD*KRW)+"원");
        };
        c1.convert();

        // 전달값이 2개인 경우?
        ConvertibleWithTwoParams c2 = (d, w)-> System.out.println(d+"달러 = "+(d*w)+"원");
        c2.convert(10,14000);

        //반환값이 있는 경우?, return 은 중괄호 기억해 그게아니면 return 삭제
        //ConvertibleWithReturn c3 =(d,w)->{return d*w;};
        ConvertibleWithReturn c3 =(d,w)-> d*w;
        int result = c3.convert(20, 1400); //수행하는 람다를 result에 넣음
        System.out.println("20 달러 ="+result+ "원");
    }

    public static void convertUSD(Convertible converter, int USD){
        converter.convert(USD);
    }
}

