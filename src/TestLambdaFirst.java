interface Executable{

    int execute(int x, int y);
}
class Runner{
    public void run(Executable e){
      int a =  e.execute(10, 9);
        System.out.println(a);
    }
}
public class TestLambdaFirst {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                System.out.println("Hello");

                return x+y;
            }
        });
        runner.run((x, y) -> x+y);
    }
}
