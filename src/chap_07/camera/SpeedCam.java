package chap_07.camera;

//SpeedCam is a Camera. (IS-A)
public class SpeedCam extends Camera {//자식클래스, extends 클래스이름
   // public  String name;
//단축키 ctrl +insert 생성자 만드는
    public SpeedCam() {

        //this.name = "과속단속카메라";
    super("과속단속 카메라");
    }

    public void takePicture(){
        //사진 촬영
        super.takePicture(); //부모 사진활영기능 끌어다 쓰고 아래 수행함
        checkSpeed();
        recognizeLicensePlate();
    }
    public void checkSpeed(){
        //속도 체크
        System.out.println(this.name+" : 속도를 측정합니다.");
    }
    public void recognizeLicensePlate(){
        //번호 인식
        System.out.println(this.name+" : 차량 번호를 인식합니다.");
    }

    @Override // annotation
    public void showMainFeature() {
            System.out.println(this.name +"의 주요 기능 : 속도 측정, 번호 인식");
        }
}
