package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n,\t, \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("좃같아요");

        System.out.println("자바가\n너무\n 좃같아요.");

        //감튀   3000원
        //햄버거  4500원
        System.out.println("감튀\t\t\t3000원");
        System.out.println("햄버거\t4500원");

        System.out.println("C:\\Program Files\\JAva"); // \\:역슬래시

        System.out.println("\"안녕\""); // \"큰 따움표
        System.out.println("\'그래\'"); // \' 작은 따움표
        System.out.println("'그래'"); // /'없이 가능

        char c = 'A';
        System.out.println(c);
        c = '\'';
        System.out.println(c);

    }
}
