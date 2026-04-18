package Basics_Java;

public class Methods {
    public static void  WlcMsg(){
        System.out.println("Welcome");
    }
    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }else {
            return false;
        }
    }
    public static int MaxNum(int a,int b){
//        int max = Math.max(a,b);
        if(a>b){
            System.out.println("A is max: "+a);
            return a;
        }
        else {
            System.out.println("B is max: "+b);
            return b;

        }
    }
    public static double Perc(int Obt,int Total){
        double per =(int) (((double)Obt/Total)*100);
        return per;
    }
    static void Display(int a){
        System.out.println("A: " +a);
    }
    static void Display(String a){
        System.out.println("a: "+a);
    }
    static int UpdateVal(int a){
        a = a+a;
        return a;
    }
    public static void main(String[] args) {
        int a = 500;
        System.out.println(UpdateVal(10));
        System.out.println(a);
        WlcMsg();
        System.out.println(sum(4,6));
        System.out.println(isEven(9));
        System.out.println(MaxNum(9,8));
        System.out.println(Perc(790,10000));
        Display(9);
        Display("Om");

    }
}
