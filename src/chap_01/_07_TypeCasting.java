package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        //형변화 TypeCasting
        //정수형에서 실수형으로
        //실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score); //93
        System.out.println((float)score);//93.0
        System.out.println((double)score);//93.0

        //float, double to int
        float score_f = 93.3f;
        double score_d = 98.8;
        System.out.println((int) score_f);//93
        System.out.println((int) score_d);//98

        //정수+ 실수 연사
        score =93+(int)98.8; //93+98
        System.out.println(score); //191

        score_d =93+98.8; //자동으로 93은 더블 형으로 변환됨.
        System.out.println(score_d);//191.8

        //변수에 형변환된 데이터 집어 넣기
        double convertedScoreDouble = score; //191 ->191.0
        // int -> long -> float -> double (자동으로 형변환)

        int convertedScoreInt =(int)score_d;
        // 191.8 -> 191 큰범위에 있는 데이터를 작은범위에 넣을려고 하니까 오류가 남.(int)넣아야함.
        // double -> float -> long  -> int (수동으로 형변환 필요)

        //숫자를 문자열로
        String s1 = String.valueOf(93);
        //String라는 클래스가 valueof라는 기능 사용해서 숫자를 문자열로 변환해줌
        s1=Integer.toString(93);//Integer로 사용해도 가능, toString 어떤것을 문자열로 변화해주는 것
        System.out.println(s1);//93

        String s2 = String.valueOf(98.8);
        s2= Double.toString(98.8); //실수형이라 Double사용
        System.out.println(s2);//98.8

        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);//93
        double d = Double.parseDouble("98.8");
        System.out.println(d);//98.8

        int error = Integer.parseInt("자바");//숫자가 아니라 에러뜸

       /* <정리>
        1. 숫자를 문자열로 변경 할때 String 변수 = String.valueOf();
           실수든 정수든 사용하면 될듯
        2. 문자열을 숫자로 변경할때 각각 외워야함.
           정수 : Integer.parseInt();
           실수 : Double.parseDouble();*/
    }
}
