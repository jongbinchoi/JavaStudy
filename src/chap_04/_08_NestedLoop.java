package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        //이중 반복문

        //별(*)사각형 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println("-------------");

        //별 (*) 왼쪽 삼각형 만들기
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <i+1; j++) { //i로만 쓸때 0<0이기 때문에 첫줄은 빈칸이 되고 담줄로 넘어가게된다.
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("-------------");

        //별 (*) 오른쪽 별 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <4-i; j++) {
                System.out.print(" ");
                // i =0 일때 아래 for문 j<3이면 " "가 3번 반복됨
            }
            for (int k = 0; k <=i; k++) {
                System.out.print("*");
                // i=0일때 위 for문 실행 후 k는 1번 *반복함 띄어쓰기 안하고 *그리고 for문 종료
            }
            System.out.println();


        }

    }
}
