package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        //제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("최종빈");
        c2.ready();

        System.out.println("------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("최재민");
        c4.ready();
//위는 각각 클래쓰만들어서 정의해준것

        System.out.println("------------------");
        int c3Name = (int)c3.name;//c3를 오브젝트라 따로 정의를 해줘야함.
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4name = (String)c4.name;
        System.out.println("주문 고객 이름 :" +c4name);

        //c4name = (String) c3.name; c3를 정수를 문자열로 형변환 시도한거임, 안됨.
        System.out.println("------------------");

        //<>사이에 대문자를 넣어야함. Integer, Double 같이
        Coffee<Integer> c5 = new Coffee(35);// 앞에 인티져 이기 때문에 뒤에 정수라고 해야함.
        c5.ready();
        int c5Name= c5.name; //위 오브젝트와 달리 제너릭에서 정수로 정의했기 때문에 따로 형 변환을 할 필요없음.
        System.out.println("주문 고객 번호 : "+c5Name);


        Coffee<String> c6 = new Coffee("최종인");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : "+c6Name);

        System.out.println("----------------------");

       CoffeeByUser<User> c7= new CoffeeByUser<>(new User("강호동"));
        //뒤 꺽쇠에는 유져가 있어도 되고 없어도 됨.
        //강호동이라는 유저 객체를 만들고 그객체를 커피바이 유저를 생성할때 집어넣음
        c7.ready();
        System.out.println("----------------------");

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
        c8.ready();


        System.out.println("----------------------");
        orderCoffee("김영철");
        orderCoffee(36);

        orderCoffee("김희철", "아메리카노");
        orderCoffee(37, "라떼");

    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : "+ name);

    }

    //값을 두개 그이 상을 넣을 때에는 여러개 넣어야함.
    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee+" 준비 완료 : "+ name);

    }
}
