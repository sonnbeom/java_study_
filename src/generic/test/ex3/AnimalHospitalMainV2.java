package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        // 이렇게 다 들어올 수 있다면 전혀 관계 없는 타입이 들어온다. Integer, Object가 들어오는 모습
        // 만약 타입 인자가 모두 Animal과 그 자식만 들어올 수 있게 제한해야 제네릭을 쓰는 이유가 생긴다.
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();
    }
}
