package chap_06;

public class _08_MainMathod {
    public static void main(String[] args) {
        for (String s :args) { // 위 args에 있는 값을 하나씩 가져와서 스트링 s로 전달하열 출력
            System.out.println(s);
        }

        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        if(args.length ==1){
          switch ( (args[0])){
              case "1":
                  System.out.println("도서 조회 메뉴입니다.");
                  break;
              case  "2":
                  System.out.println("도서 대출 메뉴입니다.");
                  break;
              case "3":
                  System.out.println("도서 반납 메뉴입니다.");
                  break;
              default:
                  System.out.println("잘못 입력하셨습니다.");
          }
        }else{
            System.out.println("사용법 1-3메뉴 중 하나만 입력해주세요");
        }
    }
}
