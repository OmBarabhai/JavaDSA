package Basics_Java;

public class Pattern {
    static void main(){
//        int n = 5;
//        for(int row = 1;row<=n;row++){
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        int n = 5;
//        for (int row = 1; row <=n ; row++) {
//            for (int col = 1; col <= n-row; col++) {
//                System.out.print("  ");
//            }
//            for (int col = 1; col <=n; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        int n= 5;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <=n-row+1 ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        int n = 5;
//        for (int row = 1; row <= n ; row++) {
//            for (int col = 1; col <=n-row ; col++) {
//                System.out.print("  ");
//            }
//            for (int col = 1; col <=2*row-1 ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        int n= 5;
//        for (int row = 1; row <=n ; row++) {
//            for (int col = 1; col <=row-1 ; col++) {
//                System.out.print(" ");
//            }
//            for (int col = 1; col<=2*n-2*row+1; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//        int n = 4;
//        for (int row = 1; row <=n ; row++) {
//            for (int col = 1; col <=6; col++) {
//                if(row == 1||row == n){
//                    System.out.print("* ");
//                }
//                else {
//                    if(col ==1||col==6){
//                        System.out.print("* ");
//
//                    }
//                    else {
//                        System.out.print("  ");
//
//                    }
//                }
//            }
//            System.out.println();
//        }
//        int n = 7;
//        for (int row = 1; row <= n; row++) {
//                if(row == 1 || row==2 || row==n){
//                    for (int col = 1; col <=row ; col++) {
//                        System.out.print("* ");
//                    }
//                }else {
//                    System.out.print("* ");
//                    for (int col = 1; col <= (row-2); col++) {
//                        System.out.print("  ");
//                    }
//                    System.out.print("* ");
//                }
//            System.out.println();

//        }

//        int n = 5;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n-row; col++) {
//                System.out.print("  ");
//            }
//           if(row == 1||row == n){
//               for (int col = 1; col <=2*row-1 ; col++) {
//                   System.out.print("* ");
//               }
//           }
//           else {
//               System.out.print("* ");
//               for (int col = 1; col <= 2*row-3; col++) {
//                   System.out.print("  ");
//               }
//               System.out.print("* ");
//           }
//            System.out.println();
//        }

//            int n = 5;
//        for (int row = 1; row <=n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("*"+" ");
//            }
//            for (int col = 1; col <=2*(n-row) ; col++) {
//                System.out.print(" "+" ");
//            }
//            for (int col = 1; col <= row; col++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//
//        }
//        for (int row = 1; row <=n; row++) {
//            for (int col = 1; col <= (n-row)+1; col++) {
//                System.out.print("*"+" ");
//            }
//            for (int col = 1; col <=(row-1)*2 ; col++) {
//                System.out.print(" "+" ");
//            }
//            for (int col = 1; col <= (n-row)+1; col++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//
//        }
//        int n = 5;
//        for (int row = 1; row <=n ; row++) {
//            for (int col = 1; col <=row ; col++) {
//                System.out.print(col+" ");
//            }
//            System.out.println();
//        }
//        int n = 5;
//        int count = 1;
//        for (int row = 1; row <=n ; row++) {
//            for (int col = 1; col <=row ; col++) {
//                System.out.print(count+" ");
//                count++;
//            }
//            System.out.println();
//        }
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print((char)(64+col)+" ");
            }
            System.out.println();
        }
    }

}
