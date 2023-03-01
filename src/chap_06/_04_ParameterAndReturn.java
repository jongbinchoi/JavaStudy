package chap_06;
//호출 같은 경우 매개변수의 값을 받아 그 값을 나타내는 것 ~~( int num) 매개변수 값안에 print함.
//반환은 메소드 안에서 값을 주는 것 ~~~() return ~~; 밖에서 print함
//호출 반환은 매개변수 값을 받고 계산후 반환값을 주는 것!  ~~~(int num) return ~~;
public class _04_ParameterAndReturn {
    public static int getPower(int num) {
        int result = num * num;
        return result;
        //가능 return num * num;
    }

    public static int getPowerByExp(int num, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *=num;
        }
        return result;
    }

    public static void main(String[] args) {
        //전달값과 반환값이 있는 메소드
        int reVal = getPower(2); // 2 * 2 = 4
        System.out.println(reVal);
        //System.out.println(getPower(2)); 가능

        reVal = getPower(3); // 3 * 3 = 9
        System.out.println(reVal);

        reVal = getPowerByExp(3,3);// 3 * 3 * =27
        System.out.println(reVal);

        System.out.println(getPowerByExp(2, 3)); //2 *2 * 2 =8
    }
}
