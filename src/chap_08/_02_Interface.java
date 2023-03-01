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
        // 단일상속 (ectends)
        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("-------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDectector();
        advancedFireDetector.detect();

        System.out.println("-------------");

        FactoryCam factoryCam =new FactoryCam();
        factoryCam.setDetector(fireDetector);
        factoryCam.setReporter(normalReporter);

        factoryCam.detect();
        factoryCam.report();

    }
}
