package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";


        //전달값과 반환값 X
        b1.autoReport(); //지원 안됨
        BlackBox.canAutoReport = true;
        b1.autoReport(); //지원 됨.


        //전달값 있는 메소드
        b1.inserMemoryCard(256);


        //전달값과 반환값이 있는 메소드
        //일반 영상 : 1(type)
        //이벤트 영상 (충돌 감지 ) : 2
        int fileCount = b1.getVideoFileCount(1); //일반 영상
        System.out.println("일반 영상 파일 수 : " +fileCount+"개" );

        fileCount = b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 파일 수 : "+fileCount+"개" );
    }
}
