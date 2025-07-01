import java.util.*;
public class Problem3_MinNoOfCoins {
    public static void main(String[] args) {
        int N = 43;
        System.out.println(minPartition(N));
    }

    static ArrayList<Integer> minPartition(int N) {
        ArrayList<Integer> li = new ArrayList<>();
        int arr[] = {1,2,5,10,20,50,100,200,500,2000};
        int i = arr.length-1;
        while(N!=0){
            if(arr[i]<=N){
                N=N-arr[i];
                li.add(arr[i]);
            }
            else{
                i--;
            }
        }
        return li;
    }
}