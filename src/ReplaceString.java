public class ReplaceString {
    public static String recusrsiveReplace(String input){
        if (input.isEmpty()){
            return input;
        }
        return recusrsiveReplace(input.substring(1)) + input.charAt(0);
    }

    public static String usingXOR(String str){
        char[] array = str.toCharArray();
        int length = array.length;
        int half = (int) Math.floor(array.length / 2);
        for (int i = 0; i < half; i++) {
            array[i] ^= array[length - i - 1];
            array[length - i - 1] ^= array[i];
            array[i] ^= array[length - i - 1];
        }
        return String.valueOf(array);
    }

    public static String usingUniCode(String str){
        return "\u202E" + str;
    }


    public static String inPlaceReverse(String number) {
        char[] ch = number.toCharArray();
        int i = 0;
        int j = number.length()-1;
        while (i < j) {
            swap(i, j, ch);
            i++;
            j--;
        }
        return String.valueOf(ch);
    }

    public static void swap(int a, int b, char[] ch) {
        ch[a] = (char) (ch[a] + ch[b]);
        ch[b] = (char) (ch[a] - ch[b]);
        ch[a] = (char) (ch[a] - ch[b]);
    }

    public static void main(String[] args) {
       System.out.println( usingUniCode("hello hi"));
        System.out.println(inPlaceReverse("hello world!"));
    }
}
