import java.util.Locale;

public class Palindrom {
    public static void main(String[] args) {
        String string = "A man a plan a canal Panama";

        System.out.println(findPal(string));
    }

    public static boolean findPal(String pal){
        pal = pal.toLowerCase(Locale.ROOT);
        pal = pal.replaceAll("\\s+", "");
        char[] charPal = pal.toCharArray();
        for (int i = 0; i < charPal.length / 2; i++){
            if (charPal[i] != charPal[charPal.length-i-1])
                return false;
        }
        return true;
    }
}
