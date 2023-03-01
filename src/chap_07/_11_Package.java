package chap_07;

import java.util.Random;
public class _11_Package {
    public static void main(String[] args) {
        //패키지
        //다른 클래쓰에 있는 매소드 사용하고싶을 때 (import 패키지 이름 크래쓰 이름)사용해야함.
        //import 패키지 이름 .*를 쓰면 그 패키지 모든 클래쓰를 사용함.

        //패키지(랜덤 클래쓰)
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt());
        System.out.println("랜덤 정수 (범위) :"+random.nextInt(10));//0이상 10미만 정수형 값
        System.out.println("랜덤 실수 (범위) :"+random.nextDouble());//0.0이상 1.0미만 정수형 값
        //System.out.println("랜덤 실수 (범위) : "+random.nextDouble(10.0)); 범위지정 안됨.

        //만약  5.0이상 10.0미만의 실수르 뽑을려면?
        double min = 5.0;
        double max =10.0;
        System.out.println("랜덤 실수 (범위) :"+(min+(max-min)*random.nextDouble())); //이런식으로 하면 됨.

        System.out.println("랜덤 boolean : "+random.nextBoolean());

        //로또 번호를 랜덤으로 뽑으려면? 1~45
        System.out.println("로또 번호 : "+ (random.nextInt(45)+1));
        //nextInt(45) : 0이상 45미만의 수
        //nextInt(45)+1 : 1이상 46미만의 수 = 1이상 45이항의 수, 각 위에 1씩 더함으로 1~45

        //Math, Scanner, StringBuilder, StringBuffer, StringTokenizer
        //BigInteger, BigDecimal
        //LocalDate, LocalTime, LocalDatetime, DateTimeFormatter
        //구글에서 자바유용한 클래쓰 검색해서 공부해라
    }
}
