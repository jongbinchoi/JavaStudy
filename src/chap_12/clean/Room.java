package chap_12.clean;

public class Room {
    public int number =1;
   synchronized public void clean(String name){//synchronized를 사용하는 이유
       // 저것을 안쓰면 두직원(두개의 쓰레드)이 같은 매소드에 접근하여 문제가 발생함.
       //동기화를 사용하면 어떤 쓰레드가 이 매소드를 접근해 작업을 하고있으면 다른쓰레드는 접근이 안됨.
        //직원 1 : 3번방 청소 완료
        System.out.println(name+ " : "+ number + "번방 청소 중");
        number++;
    }
}
