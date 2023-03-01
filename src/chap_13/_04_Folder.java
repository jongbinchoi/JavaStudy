package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir(); //위 이름에 해당하는 폴더가 만들어짐.
        if(folder.exists()){
            System.out.println("폴더가 존재합니다. : "+folder.getAbsolutePath());
        }

        System.out.println("----------------");

        folderName = "A/B/C"; //A안에 B가 있고 B안에 C가 있음
       // "A"+File.separator+"B"+File.separator+"C" 맥이나 윈도우에서 /\차이로 생성이 안될수도있음
        //separator을 하면 정확하게 구현이 가능
        //윈도우 : C:\\Users\\jongbin\\Desktop
        //맥 : /User/jongbin/Desktop
        folder = new File(folderName);
        //folder.mkdir(); //폴더 하나 만들때는 저거사용하면되고
        folder.mkdirs(); //하위구조로 여러개 폴더만들때에서는 mkdirs써야함.
        if(folder.exists()){
            System.out.println("폴더가 존재합니다. : "+folder.getAbsolutePath());
        }else{
            System.out.println("폴더 생성 실패(mkdir)");
        }
    }
}
