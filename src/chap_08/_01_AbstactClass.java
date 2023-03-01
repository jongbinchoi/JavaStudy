package chap_08;

import chap_08.Camera.Camera;
import chap_08.Camera.FactoryCam;
import chap_08.Camera.SpeedCam;

public class _01_AbstactClass {
    public static void main(String[] args) {
        //데이터 추상화 (Data Abstraction)
        //abstract 라는 키워드
        // 추상 클래스 (아직 완성도지 않은 클래스)
        // 추상 메소드 (추상 클래스 또는 인터페이스에 사용 가능한, 껍데기만 있는 메소드)

        //Camera camera = new Camera(); 카메라는 추상클래스라 객체만들기 안됨
        Camera factoryCam = new FactoryCam(); //카메라를 상속한 팩토리캠은 가능, 다양성파트에서 공부한것 처럼 부모클래쓰로 가능함
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
