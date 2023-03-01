package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술 연산자
        
        //일반 연산
        System.out.println(4+2);//6
        System.out.println(4-2);//2
        System.out.println(4*2);//8
        System.out.println(4/2); // (/)나눗셈 몫 2
        System.out.println(5%2); //나머지 1

        //우선 순위 연산
        System.out.println(2+2*2);//6 수학과 같이 곱셈이 우선순위

        //변수를 이용한 연산
        int a =20;
        int b=10;
        int c;

        c=a+b;
        System.out.println(c);//30

        //증감 연산 ++,--
        int val;
        val=10;
        System.out.println(val); //10
        System.out.println(++val); //11
        System.out.println(val); //11

        System.out.println(val++); //11
        System.out.println(val); //12
        System.out.println(val++); //12  담 값은 13
        System.out.println(val); //13

        val = 10;
        System.out.println(val); //10
        System.out.println(--val); //9
        System.out.println(val); //9

        System.out.println(val--);//9 다음값이 8
        System.out.println(val);//8

        val++; // val가 실행되고 +1됨
        ++val; // val에 +1하고 나서 수행이됨

        //은행 대기변호 표
        int waiting = 0;
        System.out.println("대기 인원 : " +  waiting++); //대기인원 : 0
        System.out.println("대기 인원 : " +  waiting++); //대기인원 : 1
        System.out.println("대기 인원 : " +  waiting++); //대기인원 : 2
        System.out.println("총 대기 인원 : " +  waiting); // 총 대기인원 : 3
    }
}
