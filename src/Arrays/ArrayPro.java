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
    public static void main(String[] args) {
        int[] arr = {2,3,4,1};  // missing 3
        System.out.println(avg(arr));
    }
}
