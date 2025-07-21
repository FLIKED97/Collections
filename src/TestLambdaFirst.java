import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//interface Executable{
//
//    int execute(int x, int y);
//}
//class Runner{
//    public void run(Executable e){
//      int a =  e.execute(10, 9);
//        System.out.println(a);
//    }
//}
public class TestLambdaFirst {
    public static void main(String[] args) {
//        Runner runner = new Runner();
//        runner.run(new Executable() {
//            @Override
//            public int execute(int x, int y) {
//                int a = 1;
//                System.out.println("Hello");
//
//                return x+y+a;
//            }
//        });
//
//        final int a = 1; //Передаються тільки константи в лямбду!
//        runner.run((x, y) -> x+y+a);// Немає своєї області видимості, тобто там де була створена то і бачить

        List<String> list = new ArrayList<>();
        list.add("Sasha");
        list.add("dddd");
        list.add("ad");

        Comparator<String> comparator = (str1, str2) ->  {
            if (str1.length() > str2.length()) return 1;
            else if (str1.length() < str2.length()) return -1;
            else return 0;
        };
        list.sort(comparator);
        System.out.println(list);
    }
}
