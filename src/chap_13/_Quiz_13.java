package chap_13;


import java.io.*;
import java.util.Scanner;

//세 살 __여든까지 간다
//버릇
//소 잃고 __고친다
// 외양간
//천 리 길도 한__부터
//걸음
//텍스트 파일에 적혀있어야함.
public class _Quiz_13 {
    public static void main(String[] args) {
//FileWriter만 사용해도 가능하지만 buffer를 효율적이여서

        Scanner sc = new Scanner(System.in);

        try (BufferedReader br = new BufferedReader(new FileReader("src/chap_13/saying.txt"))) {
            System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)");
            System.out.println("----------------------------------");

            String quiz; //문제
            String answer; //정답
            String input; //사용자 입력

            //true무한
            while (true) {
                quiz = br.readLine();
                answer = br.readLine();
                if (quiz == null || answer == null) {
                    break;
                }
                System.out.println("문제) "+quiz);
                System.out.print("정답 입력 => ");
                input = sc.next();
                if(input.equals((answer))){
                    System.out.println("정답입니다.!");
                }
                else{
                    System.out.println("틀렸습니다. 정답은"+answer+"입니다.");
                }
             }
            }catch(Exception e){
                e.printStackTrace();
            }
        System.out.println("----------------------------");
        System.out.println("모든 퀴즈가 완료되었습니다.");
        System.out.println("수고하셨습니다. ^^");
        }
    }


//Sy
//        try(BufferedWriter bw= new BufferedWriter(new FileWriter("saying.txt"))){
//           String line=bw;
//
//            System.out.print("(문제) ");
//            bw.write("세 살 __여든까지 간다");
//            bw.newLine();
//            bw.write("정답 입력 =>");
//            String a = pb.nextLine();
//                if(a==x){
//                    System.out.println("정답입니다.");
//            }else{
//                    System.out.println("틀렸습니다. 정답은 버릇입니다.");
//                }
//            System.out.print("(문제) ");
//            bw.write("소 잃고 ___고친다");
//            bw.newLine();
//            bw.write("정답 입력 =>");
//            String b = pb.nextLine();
//            if(b==y){
//                System.out.println("정답입니다.");
//            }else{
//                System.out.println("틀렸습니다. 정답은 외양간입니다.");
//            }
//            System.out.print("(문제) ");
//            bw.write("천 리 길도 한 __부터");
//            bw.newLine();
//            bw.write("정답 입력 =>");
//            String c = pb.nextLine();
//            if(c==z){
//                System.out.println("정답입니다.");
//            }else{
//                System.out.println("틀렸습니다. 정답은 걸음입니다.");
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }