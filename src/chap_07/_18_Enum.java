package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        //열거형 (Enum)
        // 달력 : JAN, FEB, MAR, ...
        // 옷 사이즈 : S, M, L
        // OS 종류 : WIN10, WIN11, MACOS, LINUX,
        // 해상도 : HD, FHD, QHD, UHD

        Resolution resolution= Resolution.HD; //Resolution이라는  열겨형은 HD값을 갖음
        System.out.println(resolution);

        resolution = Resolution.FHD;
        System.out.println(resolution);

        System.out.print("동영상 녹화 품질 : ");
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        resolution = Resolution.valueOf("UHD"); //문자열부터 값을 가져와서가능함.
        System.out.println(resolution);

        System.out.println("-----------------");

        for(Resolution myRes : Resolution.values()){//values 아래값을 하나씩 꺼내줌
            System.out.println(myRes.name()+" : "+myRes.ordinal());//name()이름, ordinal()순서대로
        }

        System.out.println("-------------------");
        for(Resolution myRes : Resolution.values()){
            System.out.println(myRes.name()+ " :"+myRes.getWidth());
        }
    }
}

enum Resolution{
    HD(1280), FHD(1920), UHD(3840);

    private final int width;
    Resolution(int width){
        this.width = width;
    }

    public  int getWidth(){
        return width;
    }
}