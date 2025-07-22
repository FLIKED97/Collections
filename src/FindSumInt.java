public class FindSumInt {
    public static void main(String[] args) {
        int[] x = new int[10];
        int a = 4;
        fillInt(x);

        findSumInt(x, a);
    }

    private static void findSumInt(int[] x, int a) {
        int start = 0;
        int end = 0;
        int sum = 0;
        while (end < x.length) {
            if (sum < a){
                sum = sum + x[end];
                end++;
                System.out.println("start: " + start + " ; " + "end: " + end + " ; " + " sum: " + sum);
            } else if (sum > a) {
                sum = sum - x[start];
                start++;
                System.out.println("start: " + start + " ; " + "end: " + end + " ; " + " sum: " + sum);
            } else {
                System.out.println("Сума: " + sum + " ; start: " + start + " ; end: " + end);
                break;
            }
        }
    }

    private static void fillInt(int[] x) {
        for (int i = 0; i < 10; i++) {
            x[i] = i+1;
        }
    }
}
