x = 00000101
y = 00000110

modPow()

static long power(long x, int y, int p)
{
	long res = 1; // Initialize result

	x = x % p; // Update x if it is more than or
	// equal to p

	if (x == 0)
	  return 0; // In case x is divisible by p;

	while (y > 0)
	{

	  if ((y & 1) != 0)
	    res = (res * x) % p;

	  // y must be even now
	  y = y >> 1; 
	  x = (x * x) % p;
	}
	return res;
}




5^54 % mod

32+16+4+2

00110110
00000001
________
00000001

(5^32) * (5^16) * (5^4) * (5^2) % mod


GCD - Post Class - GCD Pairs (Contest)

Basic approach

for(int i = 0; i < n; i++)
	for(int j = 0; j < n; j++)
		if(i != j)
			gcd(a[i], a[j]) // compute maximum gcd

10^5 ^2 = 10^10

10^6 - 10^7



12

1, 12
2, 6
3, 4


 freq = [0, 5, 3, 3, 2, 0, 2, 1, 0, 0, 0, 0, 1]


12, 3, 4, 7, 6

12 - 1, 2, 3, 4, 6, 12
3 - 1, 3
4 - 1, 2, 4
7 - 1, 7
6 - 1, 2, 3, 6


// get divisors of n
for(int x = 1; x <= sqrt(n); x++) {
	if(n % x == 0) { // x is a divisor of n
		// x is one factor
		// n/x is another factor

		freq[x]++;
		if(x != n/x) freq[n/x]++;
	}
}


for(int i = 0; i <= n; i++) {
	// index of i where freq[i] is highest
}












