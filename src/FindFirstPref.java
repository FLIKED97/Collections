import java.util.ArrayList;
import java.util.List;

public class FindFirstPref {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("interview", "interrupt", "integrate", "integration"));

        findPrefTwo(list);

    }

    private static void findPref(List<String> list) {
        String str = "";
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < list.get(0).length(); i++) {
            if (list.get(0).charAt(i) == list.get(1).charAt(i)
                    & list.get(0).charAt(i) == list.get(2).charAt(i)
                    & list.get(0).charAt(i) == list.get(3).charAt(i)){
                stringBuilder.append(list.get(0).charAt(i));
            }
        }
        str = stringBuilder.toString();
        System.out.println(str);
    }
    private static void findPrefTwo(List<String> list) {
        String str = "";
        int idx = 0;
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int j = 0; j < list.get(0).length(); j++) {
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).charAt(j) == list.get(0).charAt(j)) {
                    idx++;
                } else if (list.get(i).charAt(j) != list.get(0).charAt(j)) {
                    idx = 0;
                }
                if (idx >= list.size() - 1) {
                    stringBuilder.append(list.get(0).charAt(j));
                    idx = 0;
                }
            }
            idx = 0;
        }
        str = stringBuilder.toString();
        System.out.println(str);
    }

}
