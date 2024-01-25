package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1= new BlackBox();
        b1.modelName = "까망이";
       // b1.resolution = "FHD";
        b1.price=200000;
        b1.color= "블랙";

        //할인 행사
        b1.price = -5000;
        System.out.println("가격 : "+b1.price+"원");

        //고객문의
        System.out.println("해상도 : "+b1.resolution);

        System.out.println("________________");
        //set,get은 set에서 원하는 값이 안나오면 get에서 걸러져서 의도 된 값이 나온다고 생각하면 됨.


        BlackBox b2 =new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-5000); //setPrice가 100000이하라면 getPrice가 100000라고 표현됨, get,set을 묶어서 생각해야됨.
        b2.setColor("화이트00000000");

        System.out.println("가격 : "+b2.getPrice()+"원");
        System.out.println("해상도 : "+b2.getResolution());
    }
}

