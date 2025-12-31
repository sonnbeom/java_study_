package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object i1 = GenericMethod.objMethod(i);
        Integer i2 = (Integer) GenericMethod.objMethod(i);

        // 타입인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer i3 = GenericMethod.<Integer>genericMethod(i);

        Integer integer = GenericMethod.<Integer>numberMethod(10);
        Double v = GenericMethod.<Double>numberMethod(10.0);

        // 타입 추론 .<Integer>을 안 적어도 된다. 타입 정보를 보고 결정한다
        Integer integer5 = GenericMethod.numberMethod(10);
        Double v5 = GenericMethod.numberMethod(10.0);
        /*
        * 제네릭 타입
        정의: GenericClass<T>
        타입 인자 전달: 객체를 생성하는 시점
        예) new GenericClass<String>

        제네릭 메서드
        정의: <T> T genericMethod(T t)
        타입 인자 전달: 메서드를 호출하는 시점
        예) GenericMethod.<Integer>genericMethod(i)
        * */
    }
}
