package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try {

        //각각의 따로 예외처리한 것임, 예시로 첫번째는 입금하실려면 1번
        // 두번째는 출금 3번째 뭐시기 마지막은 상담은 연결 처럼

         // System.out.println(3 / 0);

            int[] arr= new int[3];
            arr[5]=100;

//            Object obj = "test";
//            System.out.println((int)obj);

//            String s = null;
//            System.out.println(s.toLowerCase());
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){//e는 이름, 위에 3/0문제
            System.out.println("뭔가 잘못 계산을 하셨네요"); // | 를 통해 두개의 것을 예회처리를 동시에 함.
       // } catch (ArrayIndexOutOfBoundsException e){
       //     System.out.println("인덱스를 잘못 설정했어요.");
        }catch(ClassCastException e){
            System.out.println("잘못된 형 변환 입니다.");
        } catch (Exception e) {
            System.out.println("그 외의 모든 에러는 여기서 처리가 돼요");
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
