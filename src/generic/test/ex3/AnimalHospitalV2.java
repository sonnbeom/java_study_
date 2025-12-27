package generic.test.ex3;

import generic.animal.Animal;

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용
        // 코드를 작성할 때 animal이 뭔지 알 수가 없다. Dog, Cat, Animal인지 알 수가 없다는 거임 왜? T니까
        // 그래서 Object의 기능만 쓸 수 있다.
//        System.out.println("동물 이름: " + animal.getName());
//        System.out.println("동물 크기: " + animal.getSize());
//        animal.sound();
        animal.toString();
        animal.equals(null);
    }
    public T getBigger(T target) {
//        return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}

