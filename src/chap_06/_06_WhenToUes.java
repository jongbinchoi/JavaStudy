package chap_06;

public class _06_WhenToUes {
    public static int getPower(int num) {
       // int result = num * num;
        //return result;
        //가능 return num * num;
        return getPower(num,2);
    }//메소드내에서 다른 메소드 사용가능, 아래 메소드를 호출해서 사용가능함.

    public static int getPower(int num, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *=num;
        }
        return result;
    }

    public static void main(String[] args) {
        //메소드가 필요한 이유, 코드 간결화, 유지보수

        // 2의 2승을 구하기
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *=2;
        }
        System.out.println(result); // 2*2 =4
        // 등등 계속 for문으로 코드값이 많아짐.

        System.out.println(getPower(5)); // 5 * 5 = 25
        System.out.println(getPower(2, 3)); // 2*2*2=8
    }
}
