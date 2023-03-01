package chap_06;
//오버로딩은 전달값 즉 매개변수가 갯수나 자료형이 틀릴때 이름을 다르게 설정하면 헷갈릿
//그래서 오버로딩을 통해 이름을 갖게 설정해버리고 각각 실행시키는 것, 중복 선언 가능
public class _05_Overloding {

    public static int getPower(int num) {
        int result = num * num;
        return result;
        //가능 return num * num;
    }

    public static int getPower(String strNum){
        int num = Integer.parseInt(strNum);//Integer.parseInt()문자열을 정수로 변환
        return  num * num;
    }

    public static int getPower(int num, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *=num;
        }
        return result;
    }

    public static void main(String[] args) {
        //메소드 오버로딩
        //같은 이름의 메소드를 여러 번 선언
        //1. 전달값의 타입이 다르거가
        //2. 전달값의 갯수가 다르거나
        //void 반환형은 다르면 사용 불가!!
        System.out.println(getPower(3)); // 3*3=9
        System.out.println(getPower("4")); // 4* 4=16; 4문자열을 정수로 변경후 계산
        System.out.println(getPower(2,2)); //2 * 2 =4;

    }
}
