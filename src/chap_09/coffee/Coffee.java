package chap_09.coffee;
//제내릭 클래쓰 만듦
public class Coffee <T>{
    public T name; //아직 T는 어떤 타입인지 모름, 인스턴스 변수

    //생성자
    public Coffee(T name){
        this.name = name;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : "+name);
    }
}
