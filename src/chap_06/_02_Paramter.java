package chap_06;

public class _02_Paramter {
    //전달값이 있는 메소드
    public static void power(int num){ //paramter , 매개변수(전달값)
        int result = num * num;
        System.out.println(num + "의 2승은 " + result);
    }

    public static void  powerByExp(int num, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *=num;
        }
        System.out.println(num+ "의 "+exponent+" 승은 "+result);
    }


    public static void main(String[] args) {
        //전달값, paramter
        //2-> 2*2 = 4

        //Argument 인수
        power(2); //  2 * 2 = 4
        power(3); //  3 * 3 = 9
        powerByExp(2,2); // 2 승2= 4
        powerByExp(2,3); // 2 승3= 8
        powerByExp(10,0); //1

    }
}
