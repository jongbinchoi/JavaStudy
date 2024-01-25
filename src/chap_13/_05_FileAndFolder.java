package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        //String folder = "."; // . 이 점은 자바 워크스페이라는 현재 위치를 말하는 것임
        // String folder = "C:\\Users\\Master\\Desktop\\javaWorkspace\\src\\chap_13"; // 절대경로(chap_13 우클릭 copypath 클릭 하면 복사됨.
        String folder = "src/chap_13"; // 상대경로
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : "+filesAndFolders.getAbsolutePath());
        for (File file: filesAndFolders.listFiles()) { // listFiles 모든 파일과 파일정보를 얻어옴
            if(file.isFile()){
                System.out.println("(파일) "+file.getName());
            }else if (file.isDirectory())
            System.out.println("(폴더)"+file.getName());
        }
    }
}
