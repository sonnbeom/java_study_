package generic.test.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // Animal이라고 명시해두면 자바에서 애니멀의 기능을 쓸 수 있게 만들어준다. 컴파일 에러가 안 뜨는 모습
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
        animal.toString();
        animal.equals(null);
    }
    public T getBigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}


