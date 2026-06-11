package Basics_Java.Bitwise;

public class basics {
    public static void mulBy2(int n) {
        for (int i = 1; i <= 35; i++) {
            n = n << 1;
            System.out.println(n);
        }
    }

    public static void divBy2(int n) {
        for (int i = 1; i <= 10; i++) {
            n = n >> 1;
            System.out.println(n);
        }
    }
    public static void evenOrOdd(int n) {
        if ((n & 1) == 0) System.out.println("Even ");
        else System.out.println("Odd ");
    }

    public static void swap(int a, int b){
        System.out.println("Before Swap a & b ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After Swap a & b ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

    public static void setBit1(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println("Set Bit Count: " + count);
    }

    public static void setBit2(int n) {
        System.out.println();
        if ((n & (n - 1)) == 0) {
            System.out.println("Power Of Two ");
        } else System.out.println("Not Power Of Two ");

    }
    public static int missingNum(int[] arr,int n) {
        int xor = 0;

        for (int i = 0; i < n ; i++) {
            xor= xor^i^arr[i];
        }

        return xor^n;
    }

    public static boolean powOfFour(int n){
        if(n<=0 || (n&(n-1))!= 0) return false;
        return (n & 0x55555555) != 0;
    }
    public static void main(String[] args) {
//        int[] arr = {1,2,4,5,6,7};
//        int n = 6;
        int[] arr = {0,1,2,4,5,6,7};  // missing 3
        int n = 7;
        System.out.println(missingNum(arr,n));
        System.out.println(powOfFour(16));

//        mulBy2(6);
//        divBy2(90);
//        evenOrOdd(9);
//        setBit1(9);
//        setBit2(9);
//        setBit1(4);
//        setBit2(4);
//        swap(5,6);

    }
}
