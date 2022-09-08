public class xor {
    public static void main(String[] args) {
        int m = 738;
        int k = 193;
        int c = m^k;
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(k));
        System.out.println(Integer.toBinaryString(c));
        System.out.println(c);
        System.out.println((char)(c));

       // for (int a = 738;a <= 1000,m++){
            System.out.println(c);
        }

        int crypt(int m, int k){
            int c= m^k;
            return c;
        }
    }

