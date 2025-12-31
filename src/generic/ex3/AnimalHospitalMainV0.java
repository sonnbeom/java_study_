package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {

    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍1", 100);
        Cat cat = new Cat("냥오이" , 300);

        dogHospital.setAnimal(dog);
        dogHospital.checkUp();;

        catHospital.setAnimal(cat);
        catHospital.checkUp();
    }
}
