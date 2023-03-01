package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name; //문자열 변수선언
        name = "종빈"; // String name="종빈";이라고 한줄로 가능
        int hour = 1;//정수,실수값은 ""필요 ㄴㄴ
        
        System.out.println(name + "님," + hour+ "시에 공부를 시작합니다.");
        System.out.println(name + "님, 공부 끝남.");

        double score = 90.5;
        char grade = 'A';// char 한단어 표현, 작은따움표 사용
        name = "종빈초이"; // 이때 부터 이름이 바뀜
        System.out.println(name + "님의 평균 공부점수는"+ score + "입니다.");
        System.out.println("공부 집중 점수는" + grade + "입니다.");

        boolean pass = true; // boolean은 참과 거짓을 뜻함. pass변수
        System.out.println("이번 시험에 합격함?" + pass);

        double d = 3.14; //정밀한 소수점 사용경우 double사용
        float f = 3.14F; // double값을 못넣어, F나f를 넣야함
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000l;//int 보다 큰값을 넣을때 사용되면 뒤에 L이나l써주야함
        l = 1000_000_000_000l; //값은 같음
        // int i = 1000000000000; //-21~+21억까지 범우 초과되서 안됨.
        System.out.println(l);
    }
    // 자료형을 나누는 이유 공간효율을 위해
}
