import java.util.*;
import java.io.*;
import java.lang.*;

class Main{
    public static void main(String[] args)throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
          
            String str[] = read.readLine().trim().split(" ");

            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);

            int arr[] = new int[n];
           str = read.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                  arr[i] = Integer.parseInt(str[i]);

            System.out.println(Math.abs(small(arr, k)));
        }
    }

    public static int small(int arr[], int k) {
        Arrays.sort(arr);
        int l = 0, r = arr[arr.length - 1] - arr[0];
        while (l < r) {
            int mid = (l + r) / 2;
            if (count(arr, mid) < k) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    public static int count(int arr[], int mid) {
		// System.out.println("MID " + mid);
        int ans = 0, j = 0;
        for (int i = 1; i < arr.length; i++) {
            while (j < i && arr[i] - arr[j] > mid) {
                j++;
            }
            ans += i - j;
			// System.out.print(ans + " ");
        }
		// System.out.println();
        return ans;
    }
}