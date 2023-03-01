package chap_03;
//주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램만들기
public class _Quize_03 {
    public static void main(String[] args) {
        String num = "901231-1234567";
        System.out.println(num.substring(0,8));//0위치부터8직전까지,끝위치 직전까지 잘라줌 8
        System.out.println(num.substring(0,num.indexOf("-")+2));
        //"-"위치를 찾고 그전까지 자르면 901231까지만 표기되기 때문에 2를 더해줘야함.
    }
}
