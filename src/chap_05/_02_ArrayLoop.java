package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + "하나");
        }
        System.out.println("주세요");
        System.out.println("________");

        //배열의 길이를 이용한 순회
        //배열.length 중요!!
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + "하나");
        }
        System.out.println("주세요");
        System.out.println("________");
        //enhanced for (for-each) 반복문
        for (String coffee : coffees) {
            //coffees의 배열값을 순회하는데 그때 끄대 커피라는 이름을 받아 순회하겠다.
            System.out.println(coffee + "하나");
        }
        //foreach 이용하면 자동완성 엔터나 탭으로 이동
        for (String coffee :
                coffees) {
            System.out.println(coffee + "하나");
        }
        System.out.println("주세요");
    }

//인덱스 값을 즉 특정값을 이용해서 작업할때는 fori 모든 요소 순회는 foreach


}
