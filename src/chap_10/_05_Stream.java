package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림생성 , 1차 2차 필터링 n차 필터링을 통해 내가 원하는 것만 뽑아올수있음
        //매번 스트림을 만들어야함.

        //Arrays.stream
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores); //정수형배열

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs); //문자열배열

        //Collection.stream()
        List<String> langList = new ArrayList<>();
        //langlist.add("python");
        //asList를 사용하면 하나한 추가하는 것과 같은 방식
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        //System.out.println(langList.size());

        Stream<String> langListStream = langList.stream();

        //Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "C#");

        //스트림 사용
        //중간 연산 (Intermediate Operation) , 정수기 여러개 필터
        // ㄴ filter, map, sorted, distinct, skip...
        //최종 연산 (Terminal Operation) 최종으로 나오는거 1개만 사용할 수있음
        //ㄴ count, min, max, sum, forEach, anyMatch, allMatch..

        //90 점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        // Arrays.stream(scores).filter(x->x>=90).forEach(System.out::println);//위 동작과 똑같음
        System.out.println("--------------");

        //90점 이상인 사람의 수, count 반환형이 long 아래에서는 int로 변화하기위해 저렇게씀
        int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("----------------");

        //90 점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("-------------------");

        // 90 점 이상인 점수들을 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);

        //"python", "java", "javascript", "c", "c++", "C#"
        // c 로 시작하는 프로그래밍언어
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println("-------------------");

        //java 라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
        System.out.println("-------------------"); //contain는 포함했냐

        //4글자 이하의 언어를 정렬해서 출력
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        //length는 길이 , soreted는 중간연산, forEach는 최종연산
        System.out.println("-------------------");

        //4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어
        langList.stream()
                .filter(x -> x.length()<=4)
                .filter(x -> x.contains("c"))
                .forEach(System.out::println);

        System.out.println("-------------------");

        // 4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어가 하나라도 있는지 여부
           //anymatch(맞는게 하나라도 있는지), allmatch(모든게 맞는지)
           //anymatch 앞에 boolean 써줘야함.
        boolean anyMatch = langList.stream() // boolean 다음 anyMatch는 변수
                .filter(x->x.length()<=4)
                .anyMatch(x->x.contains("c"));
        System.out.println(anyMatch);
        System.out.println("-------------------");

        //3글자 이하의 언어들은 모두 c라는 글자를 포함하는지 여부
       boolean allMatch = langList.stream() // boolean 다음 anyMatch는 변수
                .filter(x->x.length()<=3)
                .allMatch(x->x.contains("c"));
        System.out.println(allMatch);
        System.out.println("-------------------");

        //4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어 뒤에 (어려워요)라는 글자를 함께 출력
        //map x->x+"~~" 문장 붙이기? 과 같이 stream요소를 다른 형태로 변경해줌
        langList.stream()
                .filter(x->x.length()<=4)
                .filter(x->x.contains("c"))
                .map(x->x+"어려워요")
                .forEach(System.out::println);
        System.out.println("-------------------");

        //c라는 글자를 포함하는 언어를 대문자로 출력
        langList.stream()
                .filter(x->x.contains("c"))
                .map(String::toUpperCase)//x->x.toUpperCase 같음
                .forEach(System.out::println);
        System.out.println("------------------");

        //c 라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListStarsWithC = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList()); //collect로 리스받기위해서사용 그후 toList로 반환해줌

        langListStarsWithC.stream().forEach(System.out::println);
    }

}
