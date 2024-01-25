package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        //제네릭스
       /* int -> Integer.parseInt();
        String.valueOf();
        double -> Double.toString();
        float -> Float*/ //제네릭에서 사용가능

        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray); //함수 호출
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("------------");

        printAnyArray(iArray); // 기본자료형(int ,double) 제네릭에서 바로 사용불가능, 래퍼클래스를 이용해야함(Integer, Double 등 이용해야함)
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // T : Type , 아무이름이나 상관없음, k : key데이터 타입, v : Value값
    public static <T> void printAnyArray(T[] array){//array는 전달값으로 그냥 지은것
        for (T t: array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
    //제네릭경우 하나의 메소드만으로 아래의 세개의 서로다른매소드를 커버해버림.
    //불필요한 코드중복을 줄일수있음.
    //메소드에서 사용할 타입을 나중에 정하는 것을 제네릭이라고 함.
    //타입형을 대문자로

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    private static void printDoubleArray(Double[] dArray){
            for (double d : dArray) {
                System.out.print(d + " ");
            }
        System.out.println();
    }
    private static void printIntArray(Integer[] iArray) {
        for(int i : iArray){
            System.out.print(i+" "); //1,2,3,4
        }
        System.out.println();
    }
}
