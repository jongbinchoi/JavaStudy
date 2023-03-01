package chap_07;


//햄버거의 종류는 햄버거, 치즈버거, 새우버거 3가지
//각 버거는 각각의 클래스로 생성
//버거 이름을 담기위한 name변수 정의
//재료 정보를 표시하는 cook() 메소드 정의
//공통 부분은 상속 및 메소드 오버라이딩으로 처리
//모든 클래스는 하나의 파일에 정의
public class _Quiz07 {
    public static void main(String[] args) {
        Hamburgers[] hamburgers = new Hamburgers[3];
        hamburgers[0] = new Hamburgers(); //괄호속에 아무것도 없으니 생성자가 호출이될꺼임
        hamburgers[1] = new CheeseBurger();
        hamburgers[2] = new ShrimBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("------------");
        for (Hamburgers hamburger : hamburgers) {
            hamburger.cook();
            System.out.println("-----------");

        }
        System.out.println("메뉴가 준비가 완료되었습니다.");

    }
}

    class Hamburgers {
        public String name; //변수


//생성자
        public Hamburgers(){
            this("햄버거"); //이름 넣는 곳, 아래 생성자 호출
        }

        public Hamburgers(String name){// 위의 생성자 값을 받을 거임
            this.name=name; //인스턴스 위에 변수에 햄버거라는 값을 받고 넣어
            //결론적으로 위에 변수에 햄버거라고 저장됨.
        }

        public void cook(){
            System.out.println(this.name+ "를 만듭니다.");
            System.out.println("빵 사이에 들어가는 재료는?");
            System.out.println(">양상추\n+패티\n+피클");

        }
}
class CheeseBurger extends Hamburgers{
//생성자
    public CheeseBurger(){
        super("치즈버거"); //위의 스트링 생성자 호출한뒤 값을 넣어줌
    }
    public void cook(){
        super.cook(); //위의 햄버거의 cook함수사용
        System.out.println("+치즈");

    }
}

class ShrimBurger extends Hamburgers{
    public  ShrimBurger(){
        super("새우버거");
    }
    public void cook(){
        super.cook(); //위의 햄버거의 cook함수사용
        System.out.println("+새우");
    }
}
