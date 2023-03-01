package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        //사용자 입력
        Scanner sc = new Scanner(System.in);
//        System.out.println("이름을 입력하세요");
//        String name = sc.next(); //띄어 쓰기가 안됨.
//        System.out.println("혈액형을 입력하세요");
//        String bloodTye = sc.next();
//        System.out.println("키를 입력하세요");
//
//        //int height =sc.next(); // 변수이름.next는 항상 String으로 반환(빨간줄이 뜸)
//        // int height = Integer.parseInt(sc.next()); //형변황 해줘야함.
//        int height = sc.nextInt(); //위 방법이 귀찮은면 nextInt로 도 가능
//        System.out.println("몸무게를 입력하세요");
//        //double weight =Double.parseDouble(sc.next());
//        double weight =sc.nextDouble();
//
//        System.out.println("입력하신 정보는 다음과 같습니다.");
//        System.out.println("이름 : "+name);
//        System.out.println("혈액형 : "+bloodTye);
//        System.out.println("키는 : "+height);
//        System.out.println("몸무게 : "+weight);

        System.out.println("무슨 프로그래밍 언어를 배웠나요?");
        String lang = sc.next(); // 한 단어 (자바 파이썬)
        //String lang = sc.nextLine(); //nextLine 을 치면 한줄로 처리함.
        System.out.println("언어 : " + lang);

        sc.nextLine(); //불필요한 문장을 삭제
        //위 코드를 왜쓰냐? : 만약내가 한단어만 굳이 받는 코드를 사용할때
        //띄어쓰기가 있는 문장을 입력할때 보통 띄어쓰기 뒤문장은 다음입력값으로 들어감
        //하지만 저걸 사용하면 뒤문장이 다음으로 안넘어가고 컷됨.
        //자바를( 배웠어요) <=입력했을때 배웟어요가 컷됨.

        System.out.println("배우고 나니 기분이 어땠나요?");
        String feeling = sc.next(); // 한 무장 (재미었어요)
        //String feeling = sc.nextLine();
        System.out.println("기분 : "+feeling);
    }
}

//String 변수.next(); 한단어
//String 변수.nextLine(); 한문장
// 만약 한단어만 받고 다음문장을 컷하고싶다? > String 변수.next(); , 변수.nextLine();

//정수로 문장 받기
//int 변수 = Integer.parseInt(변수.next());
//int 변수 = 변수.nextInt();

//소수로 문장받기
//double 변수 = Double.parseDouble(변수.next());
//double 변수 = 변수.nextDouble();