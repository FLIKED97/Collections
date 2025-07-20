import java.util.*;

public class TestComparator {
    public static void main(String[] args) {
//        List<String> animals = new ArrayList<>();
//
//        animals.add("birdrrrr");
//        animals.add("cat");
//        animals.add("frog");
//        animals.add("dog");
//        animals.add("bird");
//        animals.add("bi");
//
//
//        Collections.sort(animals, new StringLenghtComparator());
//        System.out.println(animals);

//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(222);
//        numbers.add(1);
//        numbers.add(8);
//        numbers.add(6);
//        numbers.add(600);
//        numbers.add(396);
//        Collections.sort(numbers, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1 < o2){
//                    return 1;
//                } else if (o1 > o2){
//                    return -1;
//                } else
//                    return 0;
//            }
//        });
//        System.out.println(numbers);

        List<Person> people = new ArrayList<>();

        people.add(new Person(1, "bob"));
        people.add(new Person(3, "Katty"));
        people.add(new Person(2, "Sasha"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()){
                    return 1;
                } else if(o1.getId() < o2.getId()){
                    return -1;
                } else
                    return 0;
            }
        });
        System.out.println(people);
    }
}

class StringLenghtComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        /*
         o1 > 02 => 1;
         01 <02 => -1;
         01 == 02 => 0;

         compare(2, 1) => 1;
         compare(1, 2) => -1;
         compare(2, 2) => 0;
         */
        if (o1.length()  > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()){
            return -1;
        } else
            return 0;
    }
}

class IntegerNumLenghtComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2){
            return 1;
        } else if (o1 > o2){
            return -1;
        } else
            return 0;
    }
}
