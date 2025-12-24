package generic.ex1;

public class GenericBox<T> {
    // 제네릭 클래스는 타입을 미리 결정하지 않는다. T를 타입 매개변수라고 한다.
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
