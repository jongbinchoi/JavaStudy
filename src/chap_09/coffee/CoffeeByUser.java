package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser <T extends User>{
    //어떤 타입은 상관없지만 user에서 상속가능한 것만 사용, 다른 블랙박스 그런거 안됨.

    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}

