package chap_12.clean;

public class CleanRunnable implements Runnable{//인터페이스 여러개 한번에 구현가능, 또한 부모클래쓰도 상속가능
    @Override
    public void run() {
            System.out.println("--직원 청소 시작(Runnable)--");
            for(int i =2; i<=10; i+=2){
                System.out.println("(직원)"+i+"번방 청소 중(Runnable)");

                try {
                    Thread.sleep(1000); //1000은 1초
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            System.out.println("--직원 청소 끝(Runnable) --");



    }
}
