package generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj){
        System.out.println("OBJ PRINT : " + obj);
        return obj;
    }

    //반환 타입 앞에 제네릭 타입 매개변수를 적어주면 된다.
    public static <T> T genericMethod(T t){
        System.out.println("OBJ PRINT : " + t);
        return t;
    }


    //제한을 둘 수도 있다.
    public static <T extends Number> T numberMethod(T t){
        System.out.println("OBJ PRINT : " + t);
        return t;
    }
}
