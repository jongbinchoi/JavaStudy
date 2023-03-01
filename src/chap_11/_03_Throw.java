package chap_11;

public class _03_Throw {
    public static void main(String[] args) {
        int age = 17; //만 17세
        try{
           if(age<19){
               //System.out.println("만 19세 미만에게는 판매하지 않습니다.");
               throw new Exception("만 19세 미만에게는 판매하지 않습니다."); //new Exception 적고 새로운 객체만들기
                //예외로 던지는 것이다.
               //예) 우리가 의도적으로 원하지 않는 데이터나 결과를 예외를 만들어서 던지는것
               //어떤 유저가 로그인을 할려고 시도하는데 DB에서 데이터가 없어서 예외를 던지거나
               //로그인을 할때 비번이 틀려서 다시입력하라고 예외로 던지는 것
           }else{
               System.out.println("주문하신 상품 여기 있습니다.");
           }
        }catch (Exception e){
            e.printStackTrace(); //printStackTrace 에러가 어디서 발생했는지 알려주는 것
        }
    }
}
