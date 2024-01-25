package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 20000;
        b1.color = "블랙";

        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);

        System.out.println("_______________");

        //생성자 한줄로 처리하여 출력가능함 위 경우 객체 만들어서 일일이 넣은뒤 출력해야하는 번거로움
      BlackBox b2 = new BlackBox("하양이", "UHD",30000, "화이트");
        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);
    }

}
