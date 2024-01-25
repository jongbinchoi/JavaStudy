package chap_07.camera;

public class FactoryCam extends Camera{
    public FactoryCam() { //자식 클래스, 한!! 부모의 기능을 물려받음

        //this.name = "공장 카메라";
        super("공장 카메라");
    }

    public  void recordVideo(){
        //동영상 녹화
        /*
        System.out.println(this.name+" : 동영상을 녹화합니다.");
        //원래 recordVideo를 안쓰고 상속으로 카메라(부모)를 가져다 써야하는데 화재감지기랑 같이쓰고 싶어서 공장카메라에 넣었음
        //이렇게 화재감지기랑 같이 사용해서 오버로딩 할경우 수정을 해야하는데 상속의 의미가 없어짐.
        //이럴때 사용하는게 super임
        */

        super.recordVideo(); //부모 클래쓰기능을 사용한 후에 화재감지가 사용됨.
        detectFire();
    }

    public void detectFire(){
        //화재 감지
        System.out.println(this.name+" : 화재를 감지합니다.");
    }
    public void showMainFeature(){
        System.out.println(this.name +"의 주요 기능 : 화재 감지");
    }// 덮어 쓰기 오버라이딩으로 통해, 기존꺼를 가져다가 쓰고 수정하면됨.
}
