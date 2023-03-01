package chap_06;
//개인정보를 비공개로 전환하는 메소드 작성
//하나의 메소드에서 모든 동작 처리
//각 정보는 아래 위치부터 비공갱 적용
//.substring, length

public class _Quiz_06 {
    public static String getHiddenData(String data, int num){
            String hiddenDate = data.substring(0,num); //나코딩 -> 나
        //for (int i = num; i <data.length() ; i++)
        for (int i = 0; i < data.length()-num; i++) { //전체길이에서 -1일 빼면 2 두번 반복
            hiddenDate +="*";
            // 값이 나에서 뒤에 **두개 붙음
            // System.out.print("*"); 안됨.
        }
            return hiddenDate;
        }

    public static void main(String[] args) {
        String name="나코딩";
        String id="990130-1234567";
        String phone="010-1234-5678";

        System.out.println("이름 : " +getHiddenData(name,1));
        System.out.println("주민등록번호 : "+getHiddenData(id,8));
        System.out.println("전화번호 : "+getHiddenData(phone,9));

        System.out.println();
    }
}
