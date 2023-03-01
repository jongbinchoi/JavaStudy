package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        //변수 이름 짓는 법
        //1. 저장할 값에 어울리는 이름
        //2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능 (공백 사용 불가)
        //3. 밑줄 또는 문자로 시작 가능, 숫자로 시작 불가능
        //4. 한 단어 또는 2개 이상 단어의 연속
        //5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        //6. 예약어 사용 불가(public, static, void, int, double, float...)

        //입국 신고서 (여행)
        String nationality = "대한민국"; //
        String firstName = "종빈"; //이름
        String lastName = "최"; // 성
        String dateOfBirth ="2000-12-11"; //생년월일
        String residentialAddress = "신라호텔"; //체류지
        String purposeOfVisit = "관광"; //입국목적
        String flightNum= "A760"; //항공 편명
        String _flightnum= "A760";//밑줄로 시작
        String flight_num_2= "A790";//_로 시작
//        String -flight_num= "A760";// 오류

        int accompany = 5; // 동반 가족 수
        int lengthOfStay = 10; // 체류기간

        String item1= "시계";
        String itme2= "술";
//        String 2itme = "마약"; // 숫자로 시작 안됨

        //프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지 않을때)
        int i=0;
        String s = "";
        String str = "";

        //상수!! 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR"; // 예약어라는 final 붙이면 상수가 됨.
        //CODE = "US"; //변경이 안됨

    }
}
