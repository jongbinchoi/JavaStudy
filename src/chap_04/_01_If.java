package chap_04;
//shift+ctrl 줄변경
//shift는 줄선택선택
public class _01_If {
    public static void main(String[] args) {
        int hour =10;
        if (hour < 14) {
            System.out.println("아이스 아메리카노+1");
            System.out.println("커피 주문완료 #1");
        }
        System.out.println("샷추가");

        hour=10;
        boolean morningCoffee =false; //모닝커피
       // if(hour < 14 && morningCoffee ==false){
        if(hour < 14 && !morningCoffee){ //!는 논리부정 연산자
            System.out.println("아이스 아메레카노 +1");
        }
        System.out.println("커피 주문 완료#2");

        //오후2시 이후이거나 모닝 커피를 마신 경우?
        hour = 15;
        morningCoffee = true;
        //if(hour>=14 || morningCoffee) 같음
        if(hour>=14 || morningCoffee==true){
            System.out.println("아이스 아메리카노 (디카페인)+1");

        }
        System.out.println("커피주문 완료#3");
    }
}
