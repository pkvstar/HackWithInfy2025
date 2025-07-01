import java.util.*;
public class Problem2_FractionalKnapsack {
    public static void main(String[] args) {
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int capacity = 50;
        System.out.println(fractionalKnapsack(values, weights, capacity));
    }
    static class Pair {
        int v, w;
        Pair(int value, int weight) {
            v=value;
            w=weight;
        }
    }
    static double fractionalKnapsack(int[] values, int[] weights, int W) {
        Pair[] arr = new Pair[values.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = new Pair(values[i],weights[i]);
        }
        Arrays.sort(arr,(a,b)->Double.compare((double)b.v/b.w, (double)a.v/a.w));
        double sum = 0.0;
        for (int i=0;i<arr.length;i++) {
            Pair p = arr[i];
            if (W >= p.w) {
                W -= p.w;
                sum += p.v;
            } else {
                sum += p.v * ((double)W / p.w);
                break;
            }
        }
        return sum;
    }
}