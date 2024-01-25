package chap_13;

public class _02_Output {
    public static void main(String[] args) {

        //아래 두개 같음.
        //System.out.format();
       //System.out.printf();

        System.out.println("-------정수-------");
        System.out.printf("%d%n",123456);
        System.out.printf("%d %d %d%n", 1,2,3);//1 2 3
        System.out.printf("%d%n",1234);//1234
        System.out.printf("%6d%n",1234);//  __1234(6만큼공간을 확보하고 나서 1234출력)
        System.out.printf("%06d%n",1234);//001234 (6만큼공간을 확복 후  1234출력하는 빈공간은 0으로 채움)
        System.out.printf("%6d%n",-1234); //_-1234
        System.out.printf("%+6d%n",1234);//_+1234, 사이에 +넣어야함(항상 기호 표시)
        System.out.printf("%,15d%n",1000000000); //3자리 마다, 구분됨. __1,000,000,000(세자리마다 콤마로 구분)
        System.out.printf("%-6d%n",1234);//1234__(6자리의 공간을 확보하고 나서 왼쪽 정렬1324 출력)
       // System.out.printf("%-d%n",1234); 오류
        // \n이 줄바꿈이 보통이다. 하지만 OS(윈도우,리눅스)처럼 처리하는게 달라 %n을 사용하는 것을 권장

        System.out.println("-------실수-------");
        System.out.printf("%f%n",Math.PI); //3.141593 (일반 출력)
        System.out.printf("%.2f%n",Math.PI);//소주점 둘째자리(셋째자리 반올림)
        System.out.printf("%6.2f%n",Math.PI); //__3.14
        System.out.printf("%-6.2f%n",Math.PI); //3.14__ 왼쪽정렬
        System.out.printf("%06.2f%n",Math.PI); //003.14 빈공간을 0으로 채우기
        System.out.printf("%+6.2f%n",Math.PI);//_+3.14 (항상 +-기호 표시)

        System.out.println("-----문자열----");
        System.out.printf("%s%n","Java"); //Java (일반 출력)
        System.out.printf("%6s%n","Java"); //__Java(6자리 공간 확보하고 우측 정렬)
        System.out.printf("%-6s%n", "Java"); //Java__ (6자리 공간 확보하고 좌측 정렬)
        System.out.printf("%6.2s%n","Java"); //____Ja (6자리 공간 확보하고 우측 정렬해서 2글자 출력)
        System.out.printf("%-6.2s%n", "Java"); //Ja____ (6자리 공간 확보하고 좌측 정렬해서 2글자 출력)

        System.out.println("----응용-----");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호 "+ 90+ " "+80+" "+85.0);//강백호 90 80 85.0
        System.out.println("서태웅 "+ 100 + " "+100+ " "+ 100.0);// 서태웅 100 100 100.0
        System.out.println("채치수 "+ 95+ " "+ 100+" "+97.5); //채치수 95 100 97.5

        System.out.println("-------응용2-------");
        System.out.println("이름      영어   수학   평균");//공백이 각각 6, 3, 3칸으로 구분
        System.out.printf("%-6s %4d %4d %6.1f%n","강백호",90,80,85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n","서태웅",100,100,100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n","강백호",95,100,97.5);

        System.out.println("---------참고-----");
        System.out.println("ABCDEFG"); //위에 저렇게 한이유는 자리 맞출려고 한글 영어 크기가 다름
        System.out.println("가나다라마바사");
    }
}
