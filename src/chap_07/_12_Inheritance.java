package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        //상속

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        System.out.println("---------------------");
        camera.takePicture();
        factoryCam.recordVideo(); //부모클래스에서 레코드랑 사진기능이 제공되서 사용이 가능해짐
        speedCam.takePicture();

        factoryCam.detectFire();
        speedCam.checkSpeed();
    }
}
