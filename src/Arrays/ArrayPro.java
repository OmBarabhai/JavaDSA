package Arrays;

public class ArrayPro {
    static double avg(int[] arr){
        int sum =0;
        for(int i = 0; i < arr.length ; i++) {
             sum += arr[i];
        }
        int size = arr.length;
        return (double) sum/size;
    }

    static int[] mulByTen(int[] arr){
        int size = arr.length;
        int[] newArr = new int[size];
        for (int i = 0; i < size; i++) {
            int newEle = arr[i]*10;
            newArr[i] = newEle;
        }
        return newArr;
    }
    static int max(int[] arr){
        int maxi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(arr[i],maxi);
        }
        return maxi;
    }
    static int[] posNegSum(int[] arr){
      int neg = 0;
      int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) pos+=arr[i];
            else neg+=arr[i];
        }
        return new int[]{pos,neg};
    }
    static int[] swapAlt(int arr[]){
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length-1; i+=2) {
            int a = arr[i];
            int b = arr[i+1];
            a = a^b;
            b = a^b;
            a = a^b;
            newArr[i] = a;
            newArr[i+1] = b;
        }
        return newArr;
    }
    static int[] insertion(int arr1[], int arr2[]){
        int k = 0;
        int[] newArr = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j <arr2.length ; j++) {
                if(arr1[i] == arr2[j]){
                    newArr[k] = arr1[i];
                    k++;
                    break;
                }
            }
        }
        return newArr;
    }

    static int[] arrFrontByk(int arr[]){
        int n = arr.length;
        int[] newArr = new int[n];
        int k = 3;
        for (int i = n - 1; i > 0 ; i--) {
            newArr[i] = arr[n-k];
        }
        for (int i : arr){
            System.out.println(i+" ");
        }

        return arr;
    }
    static void rev(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k : arr){
            System.out.print(k+" ");
        }

    }
    public static void main(String[] args) {
//        int[] arr = {2,3,4,1};  // missing 3
        int[] arr4 = {1,2,3,4,5,6,7,8};
        rev(arr4);
//        System.out.println(arrFrontByk(arr4));
////        System.out.println(max(arr));
//        int[] arr1 = {1,2,3,4,5,6,7,8};
//        int[] arr2 = {2,3,4,1,3,2,1,3};
//
//        int[] arrPrint2 = insertion(arr1,arr2);
//        for(int  i : arrPrint2){
//            System.out.print(i+" ");
//        }
//
//        int[] arr3 = {1,2,3,4,5,6,7,8};  // missing
//        int[] arrPrint = swapAlt(arr3);
//        for (int i : arrPrint) {
//            System.out.print(i);
//        }

//        int[] arr = {2,3,4,1,-8,-5,6,4};  // missing
//        int[] posNeg = posNegSum(arr);
//        System.out.println("Positive Sum: "+ posNeg[0]);
//        System.out.println("Negative Sum: "+ posNeg[1]);
//

//        for(int i: posNeg){
//            System.out.print(i);
//        }
//        int[] newArr = mulByTen(arr);
//        for(int i : newArr){
//            System.out.println(i);
//        }
//        System.out.println(avg(arr));
    }
}
