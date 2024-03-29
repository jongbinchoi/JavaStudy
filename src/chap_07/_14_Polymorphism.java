package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {

        // class Person : 사람
        //class Student extends Person : 학생 (학생은 사람이다.)
        //class Teacher extends Person : 선생님 (선생님은 사람이다.)

        Camera camera =new Camera(); //클래쓰타입이 Camera
        Camera factoryCam = new FactoryCam(); //부모클래스 사용가능
        Camera speedCam = new SpeedCam();


        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature(); //상속된 내용만 사용가능함. 속도체크경우 오류남.

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam: cameras) {
            cam.showMainFeature();

        }

        System.out.println("________________1_");
// 카메라라는 부모클래쓰로 정의했기때문에 부모에있는 메소드만 사용가능
//       factoryCam.detectFire();
//       speedCam.checckSpeed();
//       SpeedCam.recognizeLicesePlate();
     //   factoryCam.recordVideo(); <<경우 부모클래쓰에 있는 함수라 사용가능함.

       if (camera instanceof  Camera){//객체 camera가 Camera라는 클래쓰로 부터 만들어진 인스턴스
           System.out.println("카메라입니다.");
       }
       if(factoryCam instanceof FactoryCam){
           ((FactoryCam)factoryCam).detectFire(); //Camera라는 클래스를 Factortcam으로 클래스 형변환해준거임.
            //(double)3 형변환 하는 것처럼 위에서 (FactoryCam)factorycam
       }

       if(speedCam instanceof SpeedCam){
           ((SpeedCam) speedCam).checkSpeed();
           ((SpeedCam)speedCam).recognizeLicensePlate();

       }
       //기본적으로 오브젝트를 상속하고있음.
       Object[] objs = new Object[3];
       objs[0] = new Camera();
       objs[1] = new FactoryCam();
       objs[2] = new SpeedCam();

    }
}
