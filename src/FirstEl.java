import java.util.*;

public class FirstEl {
    public static void main(String[] args) {
        String string = "sttiosuiiopfffjkld";
        findFirstEl(string);
    }

    private static void findFirstEl(String string){
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] temp = string.toLowerCase(Locale.ROOT).toCharArray();
        for (char c : temp) {
            if (map.get(c) == null) {
                map.put(c, 1);
            } else if (map.get(c) != null) {
                int idx = map.get(c);
                idx++;
                map.put(c, idx);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            break;
            }
        }
    }
}
