package chap_08;

import chap_07.BlackBoxRefurbish;
import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; //public이라 어디서든 쓰임
        // b1.resolution = "FHD";//default 07패키지에 있는거라 08은 접근 불가능
        // b1.price = 2000000;
        // b1.color= "블랙"; //protected





    }
}
