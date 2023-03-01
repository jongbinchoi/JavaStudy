package chap_10.converter;
@FunctionalInterface //에노테이션, 왼쫀 것을 붙이면 이건 함수형 인터페이터를 쓸거야라는 것을 컴파일러에게 알려줌
public interface Convertible {
    void convert(int USD);
    //void convert2(int USE); 두개 이상 쓰면 에러알려줌
}
