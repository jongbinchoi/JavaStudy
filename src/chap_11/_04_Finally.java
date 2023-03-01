package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        try {
            System.out.println("택시의 문을 연다.");
            throw new Exception("휴무 택시");
           // System.out.println("택시에 탑승한다.");
        }catch (Exception e){
            System.out.println("!! 문제 발생 : "+e.getMessage());
        }
        //구조 설명 : 택시문을 열었는데 throw가 예외로 던지고 알고보니
        //!!문제 발생 e.getMessage로 문장을 받아 알고보니 휴무 택시로 출력

        //문제가 발생하건 말건 무조건!! 수행해야하는 finally를 쓰면 가능함.!!
        finally{
            System.out.println("택시의 문을 닫는다.");
        }

        //try + catch(여러번)
        //try+ catch(여러번) + finally
        //try +finally
        //try단독사용 불가

        System.out.println("--------------------");
        try{
            System.out.println(3/0);
        }finally {
                System.out.println("프로그램 정상종료");
        }
    }
}
