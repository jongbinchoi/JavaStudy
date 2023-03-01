package chap_08.reporter;

public interface Reportable {
    public abstract void report(); //신고, 메소드 선언부, 노멀하고 그냐 비디어레포트를 가지고 있음
    //자동으로 public abstract가 들어가짐

    String name = "감지자";
    // 앞에 자동으로 public static final이 들어가짐
}
