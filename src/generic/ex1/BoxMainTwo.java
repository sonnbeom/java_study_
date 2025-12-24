package generic.ex1;

public class BoxMainTwo {
    public static void main(String[] args) {
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
        Integer result = (Integer) integerBox.getValue();
        System.out.println("result = " + result);
    }
}
