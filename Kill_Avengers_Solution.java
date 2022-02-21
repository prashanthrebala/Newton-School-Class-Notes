import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class Main {

    static int[] count;


	public static void main (String[] args) {


        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        sc.nextLine();
        char[] s = sc.nextLine().toCharArray();

        int l = 0, r = n;

        while(l < r) {

            int mid = (l + r) / 2;

            if(canConvert(s, mid)) {

                r = mid;

            } else {
                l = mid + 1;
            }


        }

        System.out.println(l);

	}


    static boolean canConvert(char[] s, int k) {

        // reset the count of A, G, T & C
        resetCount();


        int left = 0, right = k - 1;
        // System.out.println("Length of window: " + k);
        // System.out.println("Starting L: " + left);
        // System.out.println("Starting R: " + right);

        // increase count of A, T, G & C that are present outside the window
        for(int i = k; i < s.length; i++) {
            count[s[i]]++;
        }

        while(right < s.length) {

            // get the values of A, G, T & 
            int a = count['A'];
            int g = count['G'];
            int c = count['C'];
            int t = count['T'];

            // System.out.println("Current L: " + left + ", Current R: " + right);
            // System.out.println("Counts::: A: " + a + ", G: " + g + ", T: " + t + ", C: " + c);

            int max = Math.max(Math.max(a, g), Math.max(t, c));
            // minimum no. of conversions required.
            int toConvert = (max - a) + (max - g) + (max - c) + (max - t);

            int rem = k - toConvert;
            // System.out.println("Remaining letters to convert " + rem);

            // it is possible to solve
            if(rem >= 0 && rem % 4 == 0) {
                return true;
            }

            // move the window one step to the right
            left++; right++;
            if(right < s.length) {
                count[s[right]]--;
                count[s[left - 1]]++;
            }

        }

        // if all windows of length K are not solvable, return false.
        return false;

    }

    static void resetCount() {count = new int[256];}

}