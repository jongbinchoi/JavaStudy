package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        //어린이 키에 따른 놀이 기구 탑승 가능여부
        //조건 키가 120이상인 경우에만 탑승가능
        //삼항 연산자 이용
        int a = 115;
        int b = 121;


//          답에서는 아래처럼 표현함.
//        String height = (a>=120) ? "탑승이 가능합니다." : "탑승이 불가능합니다.";
//        System.out.println("키가"+a+"cm 이므로"+height);

        String height =(a>=120) ?"키가"+a+"cm 이므로 탑승이 가능합니다." : "키가"+a+"cm 이므로 탑승이 불가능합니다.";
        System.out.println(height);

        String height2 =(b>=120) ?"키가"+b+"cm 이므로 탑승이 가능합니다." : "키가"+b+"cm 이므로 탑승이 불가능합니다.";
        System.out.println(height2);


    }
}
