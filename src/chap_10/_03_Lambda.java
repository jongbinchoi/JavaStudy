package chap_10;

public class _03_Lambda {
    public static void main(String[] args) {
        //람다식
        //(전달값1, 전달값2, ...)->{코드}
    }

    /*public void print(){
        String s= "test";
        System.out.println(s);
    }*/


    //위코드를 람다식으로 변환
    //람다식은 접근제어자 public이 필요없다, 이름이 필요없다., 리턴타입도 자동으로 제어해줌
//    () -> {
//        String s = "test";
//        System.out.println(s);
//    }

    //전달값이 1개일 경우

//    public void print(String s) {
//        System.out.println(s);
//    }

    //1.한문장일 경우 중괄호와 세미콜론 제외가능
    //2. string도 생략가능 컴파일이 알고있음
    //3. 전달값이 1개라면 (s)에서 ()도 생략가능
   // s->System.out.println(s)

    //전달값이 2개일 경우

    /*public int add(int x, int y){
        return x+y;
    }*/

    //1.접근지정자 public 필요 없고, 2. 이름 add필요없고 3. 반환형도 필요없고 4. 전달값 자료형도 없어도됨.
    //return 이 있을경우 반드시 {}중괄호 필요, 뒤에 ;없애야함.
  // (x, y)-> x + y

}
