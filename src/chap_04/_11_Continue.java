package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        //Continue

        //치킨 주문 손님중에 노쇼 손님이 있다고 가정
        //for
        int max =20; //최대 판매수량
        int sold =0;// 현재 판매수량
        int noShow =17; //17번 대기 손님 노쇼
        for (int i = 1; i <=50; i++) {
            System.out.println(i+"번 손님, 주문하신 치킨 나왔습니다.");
            
            //손님 이 없다면 (noShow)
            if(i==noShow){
                System.out.println(i+"번 손님, 노쇼로 인해 다음소님에게 기회넘김");
                continue; //만나면 다름 횟차 반복으로 넘어감
            }
            
            sold++; //판매처리
            if(sold==max){
                System.out.println("금일 재료 소진");
                break;
            }
        }
        System.out.println("판매 종료됨.");

        System.out.println("_____________");
        //while 문
        sold=0;
        int index =0; //손님 번호
        while(index<=50){
            index++;
            System.out.println(index+"번 손님, 주문하신 치킨 나왔습니다.");
            //노쇼 고객이라면
            if(index==noShow){
                System.out.println(index+"번 손님, 노쇼로 인해 다음 손님에게 넘어갑니다.");
                continue;
            }

            sold++; //판매처리
            if(sold==max){
                System.out.println("금일 재료 소진");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

    }
}
