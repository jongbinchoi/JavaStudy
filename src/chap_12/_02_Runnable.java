package chap_12;

import chap_12.clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);//다시 넣어줘야함. ()안에
        //저것이 런어블 사용방법 왜냐고 묻냐면? 위대하신분이 저러고 만듦
        thread.start();

        cleanByBoss();
    }
    public static void cleanByBoss(){
        System.out.println("--사장 청소 시작--");
        for(int i =1; i<=10; i+=2){
            System.out.println("(사장)"+i+"번방 청소 중");
        }
        System.out.println("--사장 청소 끝 --");
    }
}
