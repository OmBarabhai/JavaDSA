package Basics_Java;

public class ArrayBasics {
    public static void main(String[] args) {
//        int[] arr = {10,20,-30,4,50};
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        System.out.println("Min Element: "+min);

//        int[] arr = {10,20,-30,4,50};
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        System.out.println("Max Element: "+max);


//        int[] arr = {10,20,30,40,50};
//        int mul = 1;
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            mul *= arr[i];
//        }
//        System.out.println(mul);

//        int[] arr = {10,20,30,40,50};
//        int sum = 0;
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);

//        int[] arr = new int[4];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            System.out.println("Provide input for index: "+ i );
//
//            arr[i] = sc.nextInt();
//
//        }
//        System.out.println("Your Array Contains");
//        for(int val: arr){
//            System.out.println(val);
//        }
//        int arr[];
//        arr = new int[5];
//        //init
//        int brr[] = {10,20,30};
//        for (int idx = 0; idx < brr.length; idx++) {
//        System.out.println("Value At Index " +idx+": "+brr[idx]);
//
//
//        }
//        int i = 0;
//        System.out.println("--For Each--");
//
//        for(int idx: brr){
//
//            System.out.println("Value At Index "+i+" : " +idx);
//            i++;
//
//        }
////        System.out.println("Value At Index 0: "+brr[0]);
////        System.out.println("Value At Index 1: "+brr[1]);
////        System.out.println("Value At Index 2: "+brr[2]);

//// 2d array And jagged array or arrays of array
        //declaration
        int[][] arr;
        arr = new int[3][3];
//        int[][] brr = {
//                {1,2},
//                {2,3},
//                {3,4},
//                {4,5}
//        };
//int rowLen = brr.length;
//int collen = brr[0].length;
//        for (int rowIdx = 0; rowIdx < rowLen; rowIdx++) {
//            for (int colIdx = 0; colIdx < collen; colIdx++) {
//                System.out.print(brr[rowIdx][colIdx]+" ");
//            }
//            System.out.println();
//
//        }
        /// Jagged Array
//        int[][] brr = {
//                {1,2},
//                {2,3,4,5,6},
//                {3,4,4},
//                {4}
//        };
//        int rowLen = brr.length;
//        for (int rowIdx = 0; rowIdx < rowLen; rowIdx++) {
//            //jaise hi main kisi new row me aava
//            //same point pr maine uss row ka colLength find out krlia
//            //current row -> brr[rowIndex]
//            //isme kitne columns -> brr[rowIndex].length
//            int collen = brr[rowIdx].length;
//
//            for (int colIdx = 0; colIdx < collen; colIdx++) {
//                System.out.print(brr[rowIdx][colIdx]+" ");
//            }
//            System.out.println();
//
//        }

//        Scanner sc = new Scanner(System.in);
//
//// fixed number of rows for homework
//        int n = 4;
//
//        int[][] brr = new int[n][];
//
//// required sizes
//        int[] sizes = {2, 5, 10, 1};
//
//        for (int rowIdx = 0; rowIdx < n; rowIdx++) {
//
//            int m = sizes[rowIdx];          // ✅ use homework sizes
//            brr[rowIdx] = new int[m];
//
//            for (int colIdx = 0; colIdx < m; colIdx++) {
//                brr[rowIdx][colIdx] = sc.nextInt();   // ✅ store input
//                System.out.print(brr[rowIdx][colIdx] + " ");
//            }
//            System.out.println();
//        }
//        int[][] brr = {
//                {1,2},
//                {2,3,4,5,6},
//                {3,4,4},
//                {4}
//        };
//
////        brr = {{1,2,3},{1,2,3}};
//        int sum = 0;
//        for (int rowIdx = 0; rowIdx < brr.length; rowIdx++) {
//            for (int colIdx = 0; colIdx <brr[rowIdx].length; colIdx++) {
//                sum +=brr[rowIdx][colIdx];
////                System.out.print(brr[rowIdx][colIdx]+" ");
//            }
////            System.out.println();
//        }
//        System.out.println(sum);
//        int[][] brr = {
//                {1,2},
//                {2,3,4,5,6},
//                {3,4,4},
//                {4}
//        };
//
//        int mul = 1;
//        for (int rowIdx = 0; rowIdx < brr.length; rowIdx++) {
//            for (int colIdx = 0; colIdx <brr[rowIdx].length; colIdx++) {
//                mul *=brr[rowIdx][colIdx];
//            }
//        }
//        System.out.println(mul);
        int[][] brr = {
                {1,2},
                {2,3,4,5,6},
                {3,4,4},
                {4}
        };

        int max = brr[0][0];
        for (int rowIdx = 0; rowIdx < brr.length; rowIdx++) {
            for (int colIdx = 0; colIdx <brr[rowIdx].length; colIdx++) {
                if(brr[rowIdx][colIdx]>max){
                    max = brr[rowIdx][colIdx];
                }
            }
        }
        System.out.println("Max: " + max);

        int min = brr[0][0];
        for (int rowIdx = 0; rowIdx < brr.length; rowIdx++) {
            for (int colIdx = 0; colIdx <brr[rowIdx].length; colIdx++) {
                if(brr[rowIdx][colIdx]<min){
                    min = brr[rowIdx][colIdx];
                }
            }
        }
        System.out.println("Min: " + min);


    }
}
