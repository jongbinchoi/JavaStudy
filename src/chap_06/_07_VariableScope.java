package chap_06;
//지역변수는 그 괄호 안에서만 사용가능함.
//변수가 선언된 영역 안에서만 가능함.
public class _07_VariableScope {
    public static void methodA(){
       // System.out.println(num);
    }

    public static void methodB(){
        int result = 1;
    }
    public static void main(String[] args) {
        int num = 3;

     //   System.out.println(result);
        for (int i = 0; i < 10; i++) {

        }
        {
            int j;
            System.out.println(num); //num은 가능
        }
     //   System.out.println(j); // 사용불가
    }
}
