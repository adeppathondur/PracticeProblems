public class IntAlternativeFormat {

    public static void convert(int input){
        char[] in = ("" + input).toCharArray();
        int size = in.length;
        int i = 0, j = size-1;
        while (i <= j) {
            if(i!=j) {
                System.out.print(in[i++]);
            }
            System.out.print(in[j--]);
        }
    }
    public static void main(String[] args) {
        convert(1234567);
        //1726
        //893642
        //18273645
        //82443
        //1726354
    }
}
