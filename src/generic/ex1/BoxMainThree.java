package generic.ex1;

public class BoxMainThree {
    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<>(); // 생성시점에 T의 타입 결정
        integerBox.setValue(1);
        Integer value = integerBox.getValue();
        System.out.println("Integer = " + value);

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setValue("hello");
        String value1 = stringGenericBox.getValue();
        System.out.println("str = " + value1);

        GenericBox<Double> doubleGenericBox = new GenericBox<>();
        doubleGenericBox.setValue(10.5);
        Double aDouble = doubleGenericBox.getValue();
        System.out.println("double = " + aDouble);

    }
}
