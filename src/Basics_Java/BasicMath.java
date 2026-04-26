package Basics_Java;

public class BasicMath {
    static int reverseNum(int num){
        int revNum = 0;
        while(num!=0){
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num / 10;

        }
        return revNum;
    }

    static int reverseNumber(int num){
        int revNum = 0;
        while(num!=0){
            int digit = num%10;
            revNum = revNum*10+digit;
            num = num /10;
        }
        return revNum;
    }
    static boolean isPalindrome(int num){
        int originalNum = num;
        int revNum = reverseNumber(num);
        if(originalNum == revNum){
            System.out.println("Number is palindrome: "+ originalNum);
            return true;
        }else {
            System.out.println("Number is not palindrome: "+ originalNum);
            return false;
        }
    }

    static boolean isPrimeOrNot(int num){
        for (int i = 2; i*i <= num ; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
//        for (int i = 2; i <num; i++) {
//            if(num%i==0){
//                return false;
//            }
//
//        }
//        return true;
    }
    static int getGCD(int a, int b){
        while(b!=0){
            int oldValueOfb = b;
            b = a%b;
            a = oldValueOfb;
        }
        return a;
    }
    static int getLCM(int a, int b){
        int gcd = getGCD(a,b);
        int prod = a*b;
        int lcm = gcd/prod;
        return lcm;
    }
    public static void main(String[] args) {
        System.out.println(getLCM(18,12));
        System.out.println(getGCD(18,12));
        isPalindrome(34532);
        isPalindrome(121);
        int n = 5;
        System.out.println(isPrimeOrNot(n));
//        System.out.println( reverseNum(32837));
    }
}
