package Arrays;

import java.util.HashMap;

public class ARRMan {
    static void shiftBy1(int arr[]) {
        int n = arr.length;
        int lastEle = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastEle;
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
//    static void shiftByk(int arr[], int k){
//        int n = arr.length;
//        int[] newArr = new int[k];
//        for (int i = n-k-1; i > 0 ; i--) {
//            arr[i] = arr[i-1];
//        }
//        arr[k-1] = newArr[k];
//
//    }

    static int[] rev(int arr[], int i, int j) {
//        int i = 0;
//        int j = arr.length-1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    static void rev(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    static void extremeAlt(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (i == j) {
                System.out.print(arr[i] + " ");
                return;
            } else {
                System.out.print(arr[i] + " ");
                i++;
                System.out.print(arr[j] + " ");
                j--;
            }
        }
    }

    static int[] getMode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int i : freq.keySet()) {
            System.out.println(i + " --> " + freq.get(i));
        }
        int maxFreqKey = -1;
        int maxFreq = -1;

        for (int key : freq.keySet()) {
            int currKey = key;
            int currKeyFreq = freq.get(key);
            if (currKeyFreq > maxFreq) {
                maxFreqKey = currKey;
                maxFreq = currKeyFreq;
            }
        }
        return new int[]{maxFreqKey, maxFreq};
    }

    static int[] maxMinMode(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int HighestFreq = Integer.MIN_VALUE;
        int maxFreqKey = -1;
        for (int key : freq.keySet()) {
            int currFreqKey = key;
            int currFreq = freq.get(key);
            if (currFreq > HighestFreq) {
                HighestFreq = currFreq;
                maxFreqKey = currFreqKey;
            }
        }
        int LowestFreq = Integer.MAX_VALUE;
        int minFreqKey = -1;
        for (int key : freq.keySet()) {
            int currFreqKey = key;
            int currFreq = freq.get(key);
            if (currFreq < LowestFreq) {
                LowestFreq = currFreq;
                minFreqKey = currFreqKey;

            }
        }
        return new int[]{maxFreqKey ,HighestFreq, minFreqKey, LowestFreq};
    }

    public static void main(String[] args) {
//        int[] arr = {1,3,5,9,6,8,2};
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 7, 7, 7, 8, 8, 8,7};
//        System.out.println("\n"+getMode(arr));
        int[] ans = maxMinMode(arr);

        System.out.println("Max Freq Key: " + ans[1]+"\n --> Highest Freq: "+ans[0] );
        System.out.println("Min Freq Key: " + ans[2]+"\n --> Lowest Freq Value: "+ans[3]);

//        int[] maxFreqNdKey = getMode(arr);
//        for (int i : maxFreqNdKey) {
//            System.out.println(i);
//        }
//        int[] minMax = maxMinMode(arr);
//        System.out.println("Max Freq of array element is: " + minMax);
//        for(int i : minMax){
//            System.out.println("Max Freq of array element is: " + i);
//
//        }

//        System.out.println("Max Freq of array element is: " + getMode(arr));
//        int[] arr = {1,2,3,4,5,6,7,8};
//        extremeAlt(arr);
//        int k = 3;
//        int n = arr.length;
//        k = k%n;

//        rev(arr,0,n-1);
//        rev(arr, 0, k-1);
//        rev(arr, k, n-1);

//        rev(arr,20);

//
//        for(int i : arr){
//            System.out.print(i+" ");
//        }
//        shiftBy1(arr);

    }
}
