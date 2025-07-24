public class JenericTest {
    public static void main(String[] args) {
//        Example<Integer> example = new Example<>();
//        int a;
//        example.addToString(1);
//        example.addToString(2);
//        example.addToString(3);
//
//        System.out.println(example.getString());

        String stringV = " Круто";
        Example<Car, String> carExample = new Example<>();
        Car car = new Car("Car1", 2024);
        Car car1 = new Car("Car2", 2000);
        Car car2 = new Car("Car3", 2003);
        carExample.addToString(car, stringV);
        carExample.addToString(car1, stringV);
        carExample.addToString(car2, stringV);

        System.out.println(carExample.getString());

    }
}

