package BinarySearch;
import java.util.*;
import java.lang.*;

class Main
{
    static boolean isValid(int[] arr,int totPara,int timeLimit,int totCook){
        int para = 0;
        for(int i =0;i<arr.length;i++){
            int totLimit = 0;
            int j = 0;
            if(totPara <= para){
                if(totLimit + j * totCook <= timeLimit){
                    totLimit = totLimit + j * totCook;
                    j++;
                }
                if(para >= totPara){
                    return true;
                }
            }
        }
        if(para >= totPara){
            return true;
        }else{
            return false;
        }

    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int L = sc.nextInt();
        int[] arr = new int[L];
        int n = arr.length;
        int st = 0;
        int max = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }

        }
        int en = max*(P*(P+1)/2);
        int ans= -1;
        while(st<=en){
            int mid = st +(en -st)/2;
            if(isValid(arr,P,mid,n)){
                ans = mid;
                en = mid -1;
            }else{
                st = mid+1;
            }
        }
        System.out.println(ans);
    }
}