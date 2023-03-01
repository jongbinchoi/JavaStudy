package chap_06;

public class _03_Return {
    //반환의 의미, 반환 값이 없으면 호출한뒤 메소드 내에서 끝나지만 반환값이 있으면 그 값을 main으로 넘겨주는 것

    // 호텔 전화번호
    public static String getPhoneNum(){
        String phoneNum = "02-1234-56789";
        return phoneNum; //반환 값은 위에 get뭐시기와 똑같은 자료형이여함.
    }
    // 호텔 주소
    public static String getActivities(){
        return "볼링장, 탁구장, 노래방";
    }
    public  static  String gerAddress(){
        return "서울시 어딘가"; //바로 값자체를 반환가능
    }

    // 호텔 액티비티

    public static void main(String[] args) {
        //반환값, Return
        String contactNum = getPhoneNum(); //String contactNum 변수선언
        System.out.println("호텔 전화번호 : " +contactNum);

       String address = gerAddress();
        System.out.println("호텔 주소 : "+address);

        System.out.println("호텔 액티비티 : " + getActivities()); //바로 사용가능
    }
}
