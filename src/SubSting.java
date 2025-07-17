public class SubSting {
    public static void main(String[] args) {
        String str = "aaajjjjb";
        String subStr = "aab";
        System.out.println(str);
        System.out.println(subStr);
        System.out.println(findSubStr(str, subStr));


    }
    public static Boolean findSubStr(String str, String subStr){
        char[] strChar = str.toCharArray();
        char[]subStrChar = subStr.toCharArray();

        int n;
        for(int j = 0; j< strChar.length; j++){
            n = 0;
            if (strChar.length < j+subStrChar.length)
                break;
            for (int i = j; i < strChar.length; i++) {
                if (strChar[i] == subStrChar[n]) {
                    n++;
                    if (n == subStrChar.length)
                        return true;

                } else {
                    n = 0;
                }
            }
        }
        return false;
    }
}
