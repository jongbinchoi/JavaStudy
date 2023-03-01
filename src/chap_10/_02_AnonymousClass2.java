package chap_10;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {

        //집에서 만드는 버거는 집집마다 달라서 그때 끄때 정의한다 익명클래스 사용 기억
        HomeMadeBurger momMadeBurger = getMomMadeBurger();

        momMadeBurger.cook();
        System.out.println("-------------------");

        HomeMadeBurger broMadeBurger = getbroMadeBurger();
        broMadeBurger.cook();
    }

    private static HomeMadeBurger getbroMadeBurger() {
        return new HomeMadeBurger() {
            //추상 메소드를 정의한것
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군대리아");
                System.out.println("재료 : 빵, 치킨패티, 양배추 샐러드, 딸기잼, 치즈, 삶은계란");
            }
        };
    }

    //static은 다른 클래쓰에서도 사용가능함.
    //아래 익명클래스, 굳이 다른 클래쓰는 만들필요없음
    public static HomeMadeBurger getMomMadeBurger(){
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제 버거");
                System.out.println("재료 : 빵, 소고기패티, 해시브라운, 양상추, 마용네즈 ,피클");
            }
        };
    }
}

abstract class HomeMadeBurger{
    //홈메이드라는 추상클래쓰로는 바로 객체를 만들수가 없고 상속해서 cook이라는 매소드를 재정의해야함.
    public abstract void cook();
}
