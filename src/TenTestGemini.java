import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TenTestGemini {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1", "Cat1", 300.0, 15));
        products.add(new Product("Product2", "Cat1", 333.0, 0));
        products.add(new Product("Product3", "Cat2", 300.0, 3));
        products.add(new Product("Product4", "Cat2", 3040.0, 5));
        products.add(new Product("Product5", "Cat1", 30.0, 2));
        List<User> users = new ArrayList<>();
        users.add(new User("Lviv", 6, "Sascha"));
        users.add(new User("cITY2", 4, "Sascha"));
        users.add(new User("City3", 3, "Sascha"));
        users.add(new User("Lviv", 1, "Sascha"));

        //Завдання: Маючи список товарів (List<Product>), згрупуй їх за категоріями.
        Map<String, List<Product>> groupProd = products.stream().collect(Collectors.groupingBy(Product::getCategory));
        System.out.println(groupProd);

        //2. Розділення за умовою ✅❌
        //Завдання: Маючи список товарів (List<Product>), розділи його на дві групи: ті, що є в наявності (stock > 0), і ті, яких немає.

        Map<Boolean, List<Product>> secondGroup = products.stream().collect(Collectors.partitioningBy(stock -> stock.getStock() > 0));
        System.out.println(secondGroup);
        //3. Групування з підрахунком 📊
        //Завдання: Маючи список користувачів (List<User>), порахуй, скільки користувачів живе в кожному місті.
        Map<String, Long> stringLongMap = users.stream().collect(Collectors.groupingBy(User::getCity, Collectors.counting()));
        System.out.println(stringLongMap);
        //4. Створення простої мапи (ключ-значення) 🗺️
        //Завдання: Маючи список товарів (List<Product>), створи мапу, де ключем буде назва товару, а значенням — його ціна.

    }
}
