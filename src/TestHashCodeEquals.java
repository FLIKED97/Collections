import java.util.*;

public class TestHashCodeEquals {
    public static void main(String[] args) {
//        Map<Person, String> map = new HashMap<>();
//        Set<Person> set = new HashSet<>();
//
//        Person person1 = new Person(1, "Саша");
//        Person person2 = new Person(1, "Саша");
//
//        map.put(person1, "Один");
//        map.put(person2, "Інше один");
//
//        set.add(person1);
//        set.add(person2);
//
//        System.out.println(map);
//        System.out.println(set);


        Map<String, Integer> map =new HashMap<>();

        map.put("Bob", 25);
        map.put("Katy", 15);
        map.put("Bill", 40);

        Set<String> set = new HashSet<>();
    }
}

class Person implements Comparable<Person>{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    // {obj} -> {int}
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    @Override
    public int compareTo(Person o) {
        if (this.name.length() > o.getName().length()){
            return 1;
        } else if (this.name.length() < o.getName().length()) {
            return -1;
        }
            return 0;
    }

    /*
    Контракт hashCode() equals()
    1) У двох перевіряємих об'єктів викликаєм метод хешкод
    якщо хеші одинакові -> два об'єкта точно різні

    якщо хеші одинакові, то це або об'єкти одинакові(тобто вони рівні), або створюється колізія
    і об'єкти не є одинакові і тоді викликається метод equals (який є повільнішим).

     */
}