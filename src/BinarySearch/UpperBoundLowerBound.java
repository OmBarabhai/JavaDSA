package BinarySearch;

public class UpperBoundLowerBound {
    public static int getLowerBound(int[] arr, int target){
        int n = arr.length;
        int st = 0;
        int en = n-1;
        int ans = -1;
        while(st<=en){
            int mid = st + (en- st)/2;
            if(arr[mid] >= target){
                ans = mid;
                en = mid - 1;
            }
            else {
                st = mid+1;
            }
        }
        return ans;
    }
    public static  int getUpperBound(int[] arr,int target){
        int n = arr.length;
        int st = 0;
        int en = n - 1;
        int ans = -1;
        while(st<=en){
            int mid = st + (en - st)/2;
            if(arr[mid] <= target){
                st = mid + 1;
            }
            else {
                ans = mid;
                en = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,30,30,35,40,40,40,55};
        int target = 35;
        int getLowerBound = getLowerBound(arr,target);
        int getUpperBound = getUpperBound(arr,target);
        System.out.println("getLowerBound : "+getLowerBound);
        System.out.println("getUpperBound : "+getUpperBound);

    }
}
