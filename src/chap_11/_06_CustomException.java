package chap_11;

public class _06_CustomException {
    public static void main(String[] args){
        //사용자 정의

        int age = 17; //만 17세
        try{
            if(age<19){
                //System.out.println("만 19세 미만에게는 판매하지 않습니다.");
                throw new AgeLessThan19Exception("만 19세 미만에게는 판매하지 않습니다."); //new Exception 적고 새로운 객체만들기
            }else{
                System.out.println("주문하신 상품 여기 있습니다.");
            }
        } catch (AgeLessThan19Exception e){
            System.out.println("조금 더 나이먹고 와라");
        } catch (Exception e){
            System.out.println("모든 예외를 처리합니다.");
        }
    }
}

class AgeLessThan19Exception extends  Exception {
    public AgeLessThan19Exception(String message) {
        super(message);
    } //생성자
}