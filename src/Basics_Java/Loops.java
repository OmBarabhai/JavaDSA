package Basics_Java;

import java.util.Scanner;

public class Loops {
    void main(){
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <=3; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= 3; i++) {// 1. i = 1
//            for (int j = 1; j <=3; j++) {//1. j = 1  <------------
//                System.out.print( "i : "+ i +","+" j : "+ j); // |
//            }//j(1)<=3 true  -------------------------------------
//
//            System.out.println();
//        }
//
//        for (int i = 1; i <=20 ; i++) {
//            for (int j = 1; j <=3 ; j++){
//                if (i > 9) break;
//                System.out.print(j);
//            }
//            if(i == 16) break;
//            System.out.println(i);
//        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i = n; i >= 1; i--) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        for (int i = 1;i<=10;i++){
//            System.out.println(n*i);
//        }
//        for (int i = 1; i <=n ; i++) {
//            System.out.println("OM");
//        }
//        for (int i = 0; i <=n ; i++) {
////
//            System.out.println(i+2);
//        }
//        for (int i = 1; i <=n ; i++) {
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }
//
//        for (int i = 1; i <=n ; i++) {
//            for (int j = i; j <=n ; j++) {
//                System.out.println(i+j);
//            }
//        }
        for (int i = 50; i <= 100; i++) {
            if(i%7 == 0){
                System.out.println(i);
            }
        }

    }
}
