import java.util.*;
public class Problem1_ActivitySelection {
    public static void main(String[] args) {
        int[][] pairs = {{1,2},{2,3},{3,4}};
        System.out.println(activity_selection(pairs));
    }

    static class Pair{
        int start;
        int end;
        public Pair(int start,int end){
            this.start = start;
            this.end = end;
        }
    }
    public static int activity_selection(int[][] pairs) {
        Pair[] arr = new Pair[pairs.length];
        for(int i=0;i<pairs.length;i++){
            Pair p = new Pair(pairs[i][0],pairs[i][1]);
            arr[i] = p;
        } 
        Arrays.sort(arr,new Comparator<Pair>(){
            public int compare(Pair a,Pair b){
                return a.end-b.end;
            }
        });
        int end = arr[0].end;
        int count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i].start>end){
                count++;
                end = arr[i].end;
            }
        }
        return count;
    }
}