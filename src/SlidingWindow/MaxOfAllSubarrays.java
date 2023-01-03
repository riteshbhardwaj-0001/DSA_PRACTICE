package SlidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class MaxOfAllSubarrays {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int size = arr.length;
        ArrayList<Integer> list = function(arr, k, size);
        System.out.println(list);
    }

    private static ArrayList<Integer> function(int[] arr, int k, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        int s_w = 0;
        int e_w = 0;
        while (e_w < size) {
            while (dq.size() > 0 && dq.getLast() < arr[e_w]) {
                dq.pop();
            }
            dq.add(arr[e_w]);
            if (e_w - s_w + 1 < k) {
                e_w++;
            } else if (e_w - s_w + 1 == k) {
                list.add(dq.getFirst());
                if(dq.getFirst()==arr[s_w]){
                    dq.pop();
                }
                s_w++;
                e_w++;
            }
        }
        return list;
    }
}