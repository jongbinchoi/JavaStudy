package chap_07;

public class BlackBoxRefurbish {
    public String modelName; //모델명, 어디서든지 접근가능
    String resolution; //해상도 ,아무것도 안적으면 디폴트
   private int price; //가격 , private 붙이게 되면 이 클래쓰 내에서만 접근가능
   protected String color; //색상

    //getter && setter 만들기 code 들어가서 제널애이션 들어가기 그 후 선택
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
      this.color =color;

    }
}

class A{

}