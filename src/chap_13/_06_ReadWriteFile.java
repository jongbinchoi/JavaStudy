package chap_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        //BufferedReader : 파일에서 내용을 읽어 올때
        //BufferedWriter : 파일에 내용을 쓸때
        //버퍼는 카트!(효율)

        //파일 쓰기
          //FileWriter fw = new FileWriter("goodjob.txt");
        //괄호에 new FileWriter("goodjob.txt")이유는 객체 fw를 선언하고 사용할 일이없기때문에 코드 단순화를 위해사용됨.

        //try (BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))) {
            // 덮어쓰기 하고싶다면 txt 뒤에 아무것도 쓰지않거나 false, 추가로 작성을 원할때 true 작성
            //try()괄호안에 넣는 이유 자동으로 끝날때 close 메소드가 호출됨.
//            bw.write("1. 이제 거의 끝이 보여요"); // \n을 해주거나
//            bw.newLine(); //newLine을 호출해서 줄바꿈(권장)
//            bw.write("2. 여기까지 오신 여러분들 정말 대단해요!");
//            bw.newLine();
//            bw.write("3.조금만 더 힘내요");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

            //파일 읽기
            try (BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))) {
                String line; //한줄씩 불러와서 출력 line변수
                while((line = br.readLine()) !=null){ //readLine은 버퍼드리드를 사용해 불러오고 line에 넣음
                    System.out.println(line);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
