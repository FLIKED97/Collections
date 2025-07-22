public class FindCopyelStr {
    public static void main(String[] args) {
        String str = "abababbaaabb";
        findNumCopyEl(str);
    }

    private static void findNumCopyEl(String str) {
        char[] chars = str.toCharArray();
        str = "";
        int idx = 1;
        StringBuilder strBuilder = new StringBuilder(str);
        for (int i = 0; i < chars.length-1; i++) {
            if (chars[i] == chars[i+1]){
                idx++;
            } else {
                strBuilder.append(chars[i]);
                if (idx != 1) {
                    strBuilder.append(idx);
                    idx = 1;
                }
            }

        }
        strBuilder.append(chars[chars.length - 1]);
        if (idx > 1) {
            strBuilder.append(idx);
        }
        str = strBuilder.toString();
        System.out.println(str);
    }
}
