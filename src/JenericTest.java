public class JenericTest {
    public static void main(String[] args) {
        Example<Integer> example = new Example<>();
        int a;
        example.addToString(1);
        example.addToString(2);
        example.addToString(3);

        System.out.println(example.getString());

        Example<Car> carExample = new Example<>();
        Car car = new Car("Car1", 2024);
        Car car1 = new Car("Car2", 2000);
        Car car2 = new Car("Car3", 2003);
        carExample.addToString(car);
        carExample.addToString(car1);
        carExample.addToString(car2);

        System.out.println(carExample.getString());

    }
}

