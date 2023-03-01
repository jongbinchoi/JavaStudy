package chap_08.reporter;

public class NormalReporter implements Reportable {//implements는 구현 인터페이스

    @Override
    public void report() {
        System.out.println("일반 화재 신고를 진행합니다."); //reportable의 메소드 선언을 여기서 구현
    }
}
