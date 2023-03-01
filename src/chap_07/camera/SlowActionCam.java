package chap_07.camera;

public class SlowActionCam {

    //상속이 안되어서, 아래 매소드랑 인스턴스 변수를 직접 선언해야함.
    String name;


    public SlowActionCam() {// 생성자임
        this.name= "슬로우 액션 카메라"; //가장 조상인 카메라 클래스로 접근
    }

    public void makeVideo(){
        System.out.println("자체 개발한 비디오 제작 기능");
    }

   //액션캠에서 파이널로 못박아서 수정안됨 즉 오버라이딩 안됨.
    /* public void makeVideo(){
        System.out.println(this.name + ": "
                +this.lens+ "로 촬영한 영상을 통해 멋진 슬로우모두 비디오를 제작합니다.");
    }*/
}
