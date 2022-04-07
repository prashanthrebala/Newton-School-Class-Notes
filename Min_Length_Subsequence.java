import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int n = s.length;
		int[] ind = new int[26];
		int[] len = new int[n];
		
		Arrays.fill(ind, -1);
		Arrays.fill(len, Integer.MAX_VALUE);

		for(int i = 0; i < n; i++) {
			if(s[i] == 'a') {
				ind[0] = i;
				len[i] = 1;
			} else {
				if(ind[s[i] - 'a' - 1] >= 0) {
					ind[s[i] - 'a'] = i;
					len[i] = len[ind[s[i] - 'a' - 1]] + i - ind[s[i] - 'a' - 1];
				}
			}

		}
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			if(s[i] == 'z' && len[i] < Integer.MAX_VALUE) {
				ans = Math.min(len[i], ans);
			}
		}

		// System.out.println(Arrays.toString(len));

		System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);

	}
}