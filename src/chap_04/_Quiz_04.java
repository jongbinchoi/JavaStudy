package chap_04;
/*
 주차 요금 정산프뢤
        주차요금은 시간당 4000원(일일 최대 요금은 30000원)
        경차 또는 장애인 차량은 최종 요금에서 50%할인

값-> 일반 차량 5시간 주차시 20000원
    경차 5시간 주차시 10000원
    장애인 차량 10시간 주차시 15000원
*/
import java.util.Scanner;
public class _Quiz_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fee=0;
        int car=0; //차 번호
        do{
            System.out.println("1.일반차량, 2.경차 3. 장애인 차량");
            System.out.println("차량을 선택해주세요");
            int num =scanner.nextInt();
            car=num;
        }while(car>4 || car<0);

       if(car==1){
           System.out.println("몇시간 주차하셨습니까?");
           int hour = scanner.nextInt();
           fee=hour*4000;
            if(fee>=30000){
                System.out.println("일반 차량"+hour+"시간 요금은 30000원입니다.");
            }
            else{
                System.out.println("일반 차량"+hour+"시간 요금은"+fee+"입니다.");
            }

       }
       else if(car==2){
           System.out.println("몇시간 주차하셨습니까?");
           int hour =scanner.nextInt();
           fee=hour*4000;

            if(fee>=30000){
                fee=30000;
                    System.out.println("경차"+hour+"시간 요금은"+fee/2+"원입니다.");
            }
            else{
                System.out.println("경차"+hour+"시간 요금은"+fee/2+"입니다.");
            }
       }
       else{
           System.out.println("몇시간 주차하셨습니까?");
           int hour =scanner.nextInt();
           fee=hour*4000;

           if(fee>=30000){
               fee=30000;
                  System.out.println("경차"+hour+"시간 요금은"+fee/2+"원입니다.");
           }
           else{
               System.out.println("경차"+hour+"시간 요금은"+fee/2+"입니다.");
           }
       }

    }


}
