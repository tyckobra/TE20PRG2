public class tycko {
    public static void main(String[] args) {
        int message = 1;
        int key = 2;
        int c = message^key;

        for (int a = 0 ; a < 1; a++) {
            System.out.println(Integer.toBinaryString(c + a));
            System.out.println(c);
        }

        String apa = ("i = c");

        char[] chars = apa.toCharArray();

        while (c < 10000) {
            int i = c++;
            System.out.println(i);
            System.out.println(Integer.toBinaryString(c));
            System.out.println(""+(int)i +" = "+ (Integer.toBinaryString)(c));
        }
    }
}
