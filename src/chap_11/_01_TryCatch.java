package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        //오류 : 컴파일 오류, 런타임 오류 (에러 error, 예외 exception) 에러는 불가능 ,예외는 수정가능
       // int i = "문자열"; <-컴파일오류

       /* int[]arr = new int[3];
        arr[5]=100;*/ //런타임오류 그냥 문장에서 오류가 없지만 실행결과 오류

       // S s = new S(); //스택오브플로어 에러

        //<런타임 오류>
      /*  S s = null;
        s.methodA();

        System.out.println("프로그램 정상 종료");*/

        //예외처리
        try{
           // System.out.println(3/0);

//            int[] arr= new int[3];
//            arr[5]=100;

            Object obj = "test";
            System.out.println((int)obj);
        }catch(Exception e){
            System.out.println("이런 문제가 발생했어요 =>"+e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}

class S{
    public void methodA(){
        this.methodA();
    }
}