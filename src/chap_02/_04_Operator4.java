package chap_02;

import java.sql.SQLOutput;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = true;
        boolean 쏘야 = true;
        boolean 단백질 = true;

        System.out.println(김치찌개 || 쏘야 || 단백질); // || or, 하나라도 ture이면 ture
        System.out.println(김치찌개 && 쏘야 && 단백질); // && 그리고 모두 true이면 true

        System.out.println((5>3) && (3>1) ); //두식이 모두 참이면 참이됨.
        System.out.println((5>3) && (3<1)); //5는 3보다 크고, 3은 1보다 작다 거짓.

        //or 연산
        System.out.println((5>3) || (3>1)); // 둘중 하나만 맞으면 트루
        System.out.println((5>3) || (3<1)); // 트루.
        System.out.println((5<3) || (3<1)); //거짓

        //System.out.println(1<2<5); 불가능함

        //논리 부정 연산자
        System.out.println(!true); //false, 앞에 !를 붙이면 반대가 됨.
        System.out.println(!false); //true
        System.out.println(!(5==5)); //false
        System.out.println(!(5==3)); // true
    }
}
