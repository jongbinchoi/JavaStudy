package chap_07;

public class BlackBox {
    //4개의 인스턴스 변수 라고함.
    String modelName; //모델명
    String resolution; //해상도
    int price; //가격
    String color; //색상
    int serialNumber; // 시리얼 번호

    static int counter =0;// 시리얼 번호를 생성해주는 역할 (처음엔 0이었다가 ++연산을 통해서 값을 증가)

    //class 변수
    static boolean canAutoReport = false; //자동 신고 기능
    //앞에 static 붙이면 클래스로 만들어진 모든 객체에 적용됨

//생성자
    BlackBox(){
        //System.out.println("기본 생성자 호출");
        //this.serialNumber=++counter; //이름이 달라서 this안붙여도 됨.
        //System.out.println("새로운 시리얼 넘버를 발급받았습니다 : "+this.serialNumber);//this.사용하여 인스턴스 변수 접근가능해짐
    }

    //생성자 만드는법
    //1. 객체가 생성되고 기본적으로 생성이 되어야하는 부분이 있어야하면 생성자명시 만들어야함.
    //2. 객체를 생성되는 동시에 객체를 초기화할때 아래같이 가능함.
    //3. 생성자 사이에서도 서로 호출가능함.

   BlackBox(String modelName, String resolution, int price, String color){
        System.out.println("사용자 정의 생성자 호출");
        this.modelName =modelName;
        this.resolution=resolution;
        this.price = price;
        this.color=color;
    }



    void autoReport(){
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else{
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void inserMemoryCard(int capacity){
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은" +capacity + "GB 입니다.");
    }
    int getVideoFileCount(int type){
        if(type == 1){//일반영상
            return 9;
        }
        else if (type==2){// 이벤트 영상
            return 1;
        }
        return 10;
    }

    // showDateTime : 날짜정보 표시여부
    // showSpeed : 속도정보 표시여부
    // min : 영상 기록단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min){
        System.out.println("녹화를 시작합니다.");
        if(showDateTime){
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if(showSpeed){
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은"+min+"분 단위로 기록됩니다.");
    }

    void record(){
        record(true, true, 5);
    }

    static void callServiceCenter(){
        System.out.println("서비스 센터(1588-0000) 로 연결합니다.");
        //modelName = "test" //인스턴스변수는 스택틱안에서 직접 접근 불가, 객체가 만들어지지 않아도 접근 가능
        canAutoReport = false;
    }

    //새로 추가하는 모델이름
    void appendModelName(String modelName) {
       this.modelName += modelName; //+를 붙이면 앞에 것과 연결됨.
       //this붙이면 클래쓰 인스턴스의 변수, 뒤에는 파라미터 즉 전달값으로 전달받은값

       // modelName += s; 파라미터가 string s라고 한다면 상관없음
    }

    //Getter & Setter //getter 값을 가져오는 것 Setter는 값을 설정
    String getModelName(){
        return modelName;
    }
    void setModelName (String modelName){
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }
        void setResolution(String resolution){
            this.resolution = resolution;
        }
        int getPrice(){
            return price;
        }

        void setPrice(int price) {
            if (price < 100000) {
                this.price = 100000;
            } else {
                this.price = price;
            }
        }
        String getColor(){
            return color;
        }
        void setColor(String color){
            this.color=color;
        }
}
