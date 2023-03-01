package chap_11;

import java.io.BufferedWriter;

public class _05_TryWithResources {
    public static void main(String[] args){
        MyFileWriter writer1 = null;
        try{
            writer1= new MyFileWriter(); //객체
            writer1.write("아이스크림이 먹고 싶어요");//write 메소드 호출
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try {
                writer1.close(); //close 할때 문젝 생길 수도있어서 아래를 씀.
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("----------------");
//try()소괄호를 쓰면 자동으로 close가 호출이 됨. 조건이 있음
        //MyFileWriter 이라는 객체는 아래 AutoCloseable 구현해줘야만
        //자동으로 close 아래를 구현가능함.

        try(MyFileWriter writer2= new MyFileWriter()){
            writer2.write("빵이 먹고싶어요");
        }catch(Exception e){
            e.printStackTrace();
        }

        BufferedWriter bw =null; //버퍼를 들어가면 writer이라는 것을 상속
        //witer를 클릭해보면 closeable이라는 인터페이서를 구현함. 그걸 한번더 들어가면, autocloseable가 closeable상속
    }
}

class MyFileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception { //메소드 정의
        System.out.println("파일을 정상적으로 닫습니다.");

    }
    public void write(String line){
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력 내용 : "+ line);
    }
}