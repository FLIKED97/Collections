import java.util.*;

public class TestComporable {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Set<Person> personSet = new TreeSet<>();

        addElements(personList);
        addElements(personSet);

        Collections.sort(personList);

        System.out.println(personList);
        System.out.println(personSet);
    }
    private static void addElements(Collection collection){
        collection.add(new Person(1, "bob"));
        collection.add(new Person(3, "Katty"));
        collection.add(new Person(2, "Sash"));
        collection.add(new Person(5, "Bobenchenko"));
    }
}
