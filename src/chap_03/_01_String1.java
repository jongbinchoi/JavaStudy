package chap_03;

import java.util.Locale;

public class _01_String1
{
    public static void main(String[] args) {
        String s= "I like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length());//29, length는 문자열의길이를 확인해줄수있음.

        //대소문자 변환
        System.out.println(s.toUpperCase());// 대문자로 변경
        System.out.println(s.toLowerCase());// 소문자로 변경

        //포함 관계,특정 단어가 포함되었는지 확인시켜줌
        System.out.println(s.contains("Java"));//포함된다면 true/ 포함되지 않는다면 false
        System.out.println(s.contains("C#")); // 포함되지 않는다면 false
        System.out.println(s.indexOf("Java")); // 위치 정보 7 ,0부터 시작
        System.out.println(s.indexOf("C#")); // 포함되지 않는다면 -1
        System.out.println(s.indexOf("and")); //첫번째 and위치 (12)
        System.out.println(s.lastIndexOf("and")); //마지막에 and위치 (23)
        System.out.println(s.startsWith("I like"));//이 문자열로 시작하면 true, 아니면 false
        System.out.println(s.endsWith((".")));//이문장이 (.)로 끝나는가?

        //변수. 뒤에 쓰임
        /*length() : 길이
        toUpperCase() : 대문자로 변경
        toLowerCase() : 소문자로 변경
        contains("~") : 특정 단어가 포함되었는지 참과 거짓으로 확인
        indexOf("~") : 특정 단어 위치 확인, 만약없다면 -1로 확인됨.
        lastIndexOf("~") : 특정단어의 마지막 위치 확인
        startsWith("~") : 특정 단어 또는 문장이 시작되는게 맞는지 참과 거짓으로 확인
        endsWith("~") : 특정 단어 또는 문장이 마지막으로 끝나는지 참과 거짓으로 확인 */
    }
}
