package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        //Final

        //public (fina) class...
        //public (final) void...//메소드
        //public > abstract > static > final > ...
        ActionCam actionCam = new ActionCam(); //클래쓰를 정의
       // actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("____________");

        SlowActionCam slowActionCam = new SlowActionCam();

        slowActionCam.makeVideo();//ActionCam의 메소드를 가져와 오버라이딩을 통해 같은 기능을 수정함.


    }
}
