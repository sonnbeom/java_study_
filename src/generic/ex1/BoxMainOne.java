package generic.ex1;

public class BoxMainOne {
    public static void main(String[] args) {
        // 코드 재사용성은 낮지만 안정성은 높다.
        IntegerBox integerBox = new IntegerBox();
        integerBox.setValue(10);
        Integer integer = integerBox.getValue();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.setValue("hello");
        String str = stringBox.getValue();
        System.out.println("str = " + str);
    }
}
