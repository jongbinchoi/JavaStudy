package chap_05;
// 시날 사이즈는 250부터 295까지 5단위로 증가
// 신발 사이즈 수는 총 10가지
public class _Quiz_05 {
    public static void main(String[] args) {
        String[] shoes = new String[10];
        int size=250;

        for (int i = 0; i <shoes.length ; i++) {
            shoes[i]=String.valueOf(size);
            size+=5;
            /*
            shoes[i]=250+(5*i);
            for (int ssize : shoes) {
                System.out.println("사이즈" + shoes+ " (재고있음)");
            }
 */
        }
        for (int i = 0; i <shoes.length; i++) {
            System.out.println("사이즈 "+shoes[i]+" (재고있음)");
        }
    }
}
