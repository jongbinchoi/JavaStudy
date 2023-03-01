package chap_04;

public class _05_For {
    public static void main(String[] args) {
        //반복문 for
        for(int i=0; i<10; i++){
            System.out.println("시발"+i);
        }

        //짝수만 출력(fori 만 적고 엔터)
        //0,2,4,6,8
        for (int i = 0; i < 10; i+=2) {
                System.out.print(i);
            
        }

        System.out.println();

        //홀수만 출력
        //1,3,5,7,9
        for (int i = 1; i <10 ; i+=2) {
            System.out.print(i);
        }

        System.out.println();

        //거꾸로 숫자
        //5,,4,3,2,1
        for (int i = 5; i >0 ; i--) {
            System.out.print(i);
        }

        System.out.println();

        //1부터 10까지 수합
        int sum=0;
        for (int i = 1; i <11 ; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
