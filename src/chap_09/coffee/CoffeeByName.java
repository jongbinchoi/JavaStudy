package chap_09.coffee;

public class CoffeeByName {
    public Object name;//Integer, Double, String

    //생성자
    public CoffeeByName(Object name) {
        this.name = name; //this name에 이름이라는 매개변수를 받아 집어 넣는거임
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " +name);
    }
}
