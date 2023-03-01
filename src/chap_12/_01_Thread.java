package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        //하나의 프로세스(Process) : 여러개 쓰레드 보유가능
        //쓰레드 (Thread) : 사용 이유 동시에 시켜서 빨리 끝낼려고
        //우리가 만드는 프로그램(그림판, 계산기)
        //프로그램 더블클릭 -> 실행되어 돌아가는 상태 ->프로세스
        //프로세스 자원을 이용해서 작업을 하는 것을 ->쓰레드

        // 1 3 5 7 9
        // 2 4 6 8 10

        //cleanBySelf();

        //클래스로 부터 객체만드는 방법, 객체는
        //클래스 이름 적기 , 이름 = new 클래스 이름();
        CleanThread cleanThread = new CleanThread();
       // cleanThread.run(); //직원 청소
        cleanThread.start(); // 새로운 쓰레드를 만들어서 cleanThread 내에서 run작업이 돌아감

        cleanByBoss(); //사장 청소
    }

    public static void cleanBySelf(){
        System.out.println("--혼자 청소 시작--");
        for(int i =1; i<=10; i++){
            System.out.println("(혼자)"+i+"번방 청소 중");
        }
        System.out.println("--혼자 청소 끝 --");
    }

    public static void cleanByBoss(){
        System.out.println("--사장 청소 시작--");
        for(int i =1; i<=10; i+=2){
            System.out.println("(사장)"+i+"번방 청소 중");
        }
        System.out.println("--사장 청소 끝 --");
    }
}
