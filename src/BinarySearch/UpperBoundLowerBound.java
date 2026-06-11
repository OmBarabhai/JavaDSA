package BinarySearch;

public class UpperBoundLowerBound {

    static int[] LowUppBound(int[] arr,int target){
        int st = 0;
        int en = arr.length - 1;
        int lowBound = -1;
        while(st <= en){
            int mid = st + (en - st) /2;
            if(arr[mid] > target){
                lowBound = mid;
                en = mid - 1;

            }else {
                st =mid +1;
            }
        }
        st = 0;
        en = arr.length - 1;
        int uppBound = -1;
        while(st <= en){
            int mid = st + (en - st) /2;
            if(arr[mid] >= target){
                uppBound = mid;
                en = mid - 1;
            }else{
                st = mid +1;
            }
        }
        if(lowBound >= 0 && uppBound <= arr.length - 1)
            return new int[]{lowBound, uppBound};
        else
            return new int[]{-1, -1};

    }
    public static void main(String[] args) {

        int[] arr = {10,20,30,30,30,30,31,40,40,40,55};

        int target = -3;

        int[] uLb = LowUppBound(arr, target);
//        int ub = getUpperBound(arr, target);

        System.out.println("Lower Bound Index : " + uLb[0]+"\nUpper Bound Index : " + uLb[1]);
    }
}
