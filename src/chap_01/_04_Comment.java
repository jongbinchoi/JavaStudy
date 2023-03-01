package chap_01;

public class _04_Comment {
    public static void main(String[] args) {
        System.out.println("(10분 전) 잠시 후 결혼식 시작 예정이오니 착석 부탁드립니다."); //ctrl D하면 윗문장 복사
        System.out.println("(5분 전) 잠시 후 결혼식 시작 예정이오니 착석 부탁드립니다.");
        System.out.println("지금부터 결혼식을 시작하겠습니다.");

        int size = 120;
        size = size + 10; // size + =10;은 안됨.
        System.out.println("신발 사이즈" + size + "으로 보여주세요.");

        // 여러줄을 한번에 주석을 하고싶을 때 1. 한줄 주석 처리 방법 ctrl+/
        // 여러줄을 한번에 주석을 하고싶을 때 2. 여러줄 주석 처리 ctrl+shift+/
    }
}
