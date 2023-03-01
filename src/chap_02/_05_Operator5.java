package chap_02;

public class _05_Operator5 {
    public static void main(String[] args){
        //삼항 연산자
        //결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x=5;
        int y=3;
        //                참  거짓
        int max = (x>y) ? x : y; //괄호가 참이면 x가 맞고 아니면 두번째 y가 나옴.
        System.out.println(max);

        int min=(x<y) ? x : y;
        System.out.println(min); //3

        boolean b = (x==y) ? true : false;
        System.out.println(b);

        String s= (x!=y) ? "다르다" : "같다";
        System.out.println(s); //다르다

    }
}
