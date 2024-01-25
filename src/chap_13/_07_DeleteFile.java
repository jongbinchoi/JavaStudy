package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("goodjob.txt"); //지울 파일명을 괄호안에 넣기
        if(file.exists()) { //exists 파일이 존재할때만
            if (file.delete()) {
                System.out.println("파일 삭제 성공 : " + file.getName());
            } else {
                System.out.println("파일 삭제 실패 : " + file.getName());
            }
        }

        File folder = new File("A"); // A먼저 쓸경우 실패 하위 B,C라는 폴더가 있기 때문
        //   A/B/C 형식으로 지워야함.
        if(folder.exists()){
            if(folder.delete()){
                System.out.println("*폴더 삭제 성공 : "+folder.getAbsolutePath());
            }else{
                System.out.println("*폴더 삭제 실패 : "+folder.getAbsolutePath());
            }
        }

        if (deleteFolder(folder)){
            System.out.println("폴더 삭제 성공 : "+folder.getAbsolutePath());
        }else{
            System.out.println("폴더 삭제 실패 : "+folder.getAbsolutePath());
        }
    }
    //한번에 삭제하기 위한 별도의 매소드 구현
    //deleteFolder(A)
    //  deleteFolder(B)
    //     deleteFolder(C)
    //     C.delete()삭제
    //   B.delete()삭제
    //A.delete()삭제
    public  static boolean deleteFolder(File folder){
        if(folder.isDirectory()) { //전달 받은 폴더인지 확인
            for(File file : folder.listFiles()){
                deleteFolder(file);
            }
        }
        System.out.println("삭제 대상 : "+folder.getAbsolutePath());
        return folder.delete();
    }
}
