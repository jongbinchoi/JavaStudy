package chap_08;

/*import chap_08.reporter.NormalReporter;
import chap_08.reporter.Reportable;
import chap_08.reporter.VideoReporter;

//다른 클래스에 있는 메소들르 사용하고싶어서 import사용함.
*/
import chap_08.Camera.FactoryCam;
import chap_08.detector.AdvancedFireDectector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import  chap_08.reporter.*; //통합해도됨.
public class _02_Interface {
    public static void main(String[] args) {
        //인터페이스는 뼈대만 제공
        //단일상속(extends) 부모를 하나만 가질수있음
        //때로는 여러곳을 나뉘어진 기능을 써야함. <=인터페이스 이용하면 해결가능
        //부모클레쓰를 상속된 자식클래스에서 메소드가 있다, 자식클래쓰들의 매서드가 이름이 같을때 복잡해짐
        //그래서 이런것들을 인터페이스로 따로 빼서 코드의 중복을 줄이고 보다 효율적으로 만듦

        //왜 인터페이스를 사용하냐? 각각 클래스에 같은 메소드가 여러개일 경우
        //복잡하고 비효율적임 그래서 인터페이서를 사용하여, 인터페이스에서 선언하고
        //새로운 클래스에서 인터페이스를implements하여 그 매소드 이름은 같지안 오버라이딩을 통해 기능을 달리함.

        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("-------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDectector();
        advancedFireDetector.detect();

        System.out.println("-------------/");

        FactoryCam factoryCam =new FactoryCam();
        factoryCam.setDetector(fireDetector); //값을 넣기만 하고 출력아직 안한 상태
      //순서도 팩토리캠.세터에 파이어이름 넣음
        //아래 함수 호출로 파이어디텍터.디팩를 호출

        factoryCam.setReporter(normalReporter);

        factoryCam.detect();
        factoryCam.report();

    }
}
