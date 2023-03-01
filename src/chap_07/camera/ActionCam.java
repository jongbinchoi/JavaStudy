package chap_07.camera;

public final class ActionCam extends Camera { //파이널을 붙이면 액션캠을 상속못함,
   public final String lens;// = "광각렌즈";//final 사용하면 못바꿈 못박는 거야

    //현재 빨간줄 뜨는 이유는 값이 없어서 초기화 되지않아서 그런거임 생성과 동시에 초기화가능
    //1. 생성과 동시에 초기화 2. 생성자안에서 초기화

    public ActionCam() { //생성자
        super("액션 카메라");
        lens= "광각렌즈";
    }
//메소드 함수를 만듦 아래
    public final void makeVideo(){
       // this.lens = "값 변경 불가 같은 클래스여도";
        System.out.println(this.name + ": " +this.lens+ "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
