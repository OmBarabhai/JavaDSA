package Basics_Java.Bitwise;

public class NegBin {
    public static int bin1(int n){
        int ans = 0;
        int i = 0;
        while (n!=0){
            int bit = n&1;
            ans = ans + (bit*(int)Math.pow(10,i));
            n = n>>1;
            i++;
        }
        return ans;
    }
    public static String binNeg(int n){
       StringBuilder sb = new StringBuilder();
        for (int i = 31; i >= 0 ; i--) {
            int bit = (n>>i)&1;
            sb.append(bit);
        }
        return sb.toString();
    }

    public static int bin2(int n) {
        int ans = 0;
        int place = 1;
        while (n != 0) {
            int bit = n & 1;
            ans = ans + bit * place;
            n = n >> 1;
            place = place * 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println (bin1(543));
        System.out.println(binNeg(-8));
        System.out.println (Integer.toBinaryString(-8));
        System.out.println(bin2(543));

    }
}
