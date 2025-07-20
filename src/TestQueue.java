import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Person> queue= new LinkedList<>();

        queue.add(new Person(3, "Katty"));
        queue.add(new Person(2, "Sasha"));
        queue.add(new Person(6, "Sashaa"));
        queue.add(new Person(5, "Fly"));
        queue.add(new Person(1, "bob"));

        //person3 -> person2 -> person6 - person5, person1
        for(Person person : queue)
            System.out.println(person);
        Queue<Person> queueBlicking = new ArrayBlockingQueue<Person>(10);

        queueBlicking.add(new Person(3, "Katty"));
        queueBlicking.add(new Person(2, "Sasha"));
        queueBlicking.add(new Person(6, "Sashaa"));
        queueBlicking.add(new Person(5, "Fly"));
        queueBlicking.add(new Person(1, "bob"));

        System.out.println(queueBlicking.remove());
        System.out.println(queueBlicking.peek());
        System.out.println(queueBlicking);
    }
}
