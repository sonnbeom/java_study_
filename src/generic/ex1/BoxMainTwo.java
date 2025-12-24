package generic.ex1;

public class BoxMainTwo {
    public static void main(String[] args) {

        // 코드 재사용성은 높지만 타입 안정성은 낮다.

        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);
        Integer integer = (Integer) integerBox.getValue();
        System.out.println("Integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.setValue("hello");
        String str = (String) stringBox.getValue();
        System.out.println("str = " + str);

        // 잘못된 타입의 인수 전달시
        integerBox.setValue("문자를 실수로 넣어봅시다.");
        // 꺼낼 때는 Object다 자식은 부모를 담을 수 없다. 다운 캐스팅이 필요하다.
        // set의 매개변수가 Object이기 때문에 / 현재는 컴파일러가 잡아주지 않기 때문에 타입 안정성이 낮다.
        Integer result = (Integer) integerBox.getValue(); // 캐스팅 예외
        System.out.println("result = " + result);
    }
}
