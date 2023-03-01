package chap_08.Camera;

public abstract class Camera { //avstract 를 이용해서 객체를 못만들게 하는것
    public  void takePicture(){
        System.out.println("사진을 촬영합니다.");
    }

    public void recodVideo(){
        System.out.println("동영상을 녹화합니다");
    }

   public  abstract  void showMainFeature();// 추상 메소는 선언만됨, 구현해야 하는 메소드
}
