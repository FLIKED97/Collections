interface Executable{

    int execute();
}
class Runner{
    public void run(Executable e){
      int a =  e.execute();
        System.out.println(a);
    }
}
public class TestLambdaFirst {
    public static void main(String[] args) {
        //Thread thread = new Thread(() -> System.out.println("Hello"));
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute() {
                System.out.println("Hello");

                return 1;
            }
        });
        runner.run(() -> 5);
    }
}
