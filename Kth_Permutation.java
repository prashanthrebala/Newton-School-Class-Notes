import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			list.add(i);
		}

		if(n > 12) {
			for(int i = 0; i < n - 12; i++) {
				System.out.print(list.get(0));
				list.remove(0);
			}
		}

		System.out.println(solve(list, k - 1, list.size()));

		

	}

	static String solve(ArrayList<Integer> list, int k, int n) {

		if(n == 0 || list.size() == 0) return "";

		int f = 1;
		for(int i = 1; i < n && f <= k; i++) {
			f *= i;
		}

		int index = k / f;
		String num = Integer.toString(list.get(index));
		list.remove(index);
		return num + solve(list, k % f, n - 1);
	}


}