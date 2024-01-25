package chap_08.Camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    private Detectable detector;// 인스턴스 변수
    private Reportable reporter;

    //alt+insert해서 setter선택
    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }


    @Override
    public void detect() {
        detector.detect();

    }

    @Override
    public void report() {
        reporter.report();
    }
}
