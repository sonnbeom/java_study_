package generic.ex1;

public class BoxMainTwo {
    public static void main(String[] args) {
        ObjectBox objectBox = new ObjectBox();
        objectBox.setValue(10);
        Integer integer = (Integer) objectBox.getValue();
        System.out.println("Integer = " + integer);

    }
}
