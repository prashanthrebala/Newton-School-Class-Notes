import java.util.*;

public class MyClass {
    
    public static void main(String args[]) {
        
        // creates a minHeap
        PriorityQueue<Integer> queue = new PriorityQueue();
        
        // add - adds an element (logN).
        // peek - tells you the topmost element (O(1))
        // poll - removes the topmost element  (O(logN))
        queue.add(-8);
        queue.add(-6);
        queue.add(-7);
        queue.add(-1);
        queue.add(-2);
        queue.add(-3);
        queue.add(-4);
        
        int x = queue.poll();
        
        System.out.println(x);
        System.out.println(queue.peek());
        
        
        int[][] arr = new int[][]{{2, 3}, {1, 4}, {6, 2}, {4, 7}, {5, 3}};
        
        
        Arrays.sort(arr, new Comparator<int[]> (){
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        
        System.out.println(Arrays.deepToString(arr));
        
        
    }
}