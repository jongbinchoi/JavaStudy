package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        //조건문 ElseIf
        //초코라떼
        //없다면 딸기라떼
        //그것도 없으면 아아

        boolean chocoalateLatte = false;// 초코라떼
        boolean strawberryLatte = false;// 딸기라떼
        boolean orangeJuice = true;// 오렌지주스

        if(chocoalateLatte){
            System.out.println("초코라떼+1");
        }else if(strawberryLatte) {
            System.out.println("딸기라떼+1");
        }else if(orangeJuice) {
            System.out.println("오렌지+1");
        }
        else{
            System.out.println("아아+1");
        }
        System.out.println("커피주문 완료#1");

        //else 없이도 가능
       chocoalateLatte = false;// 초코라떼
       strawberryLatte = false;// 딸기라떼
        orangeJuice = false;// 오렌지주스

        if(chocoalateLatte){
            System.out.println("초코라떼+1");
        }else if(strawberryLatte) {
            System.out.println("딸기라떼+1");
        }else if(orangeJuice) {
            System.out.println("오렌지+1");
        }
        System.out.println("커피주문 완료#2");
    }
}
