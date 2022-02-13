

% MOD

result will always be non-negative integer


% 7

-7 0
-6 1
-5 2
-4 3
-3 4
-2 5
-1 6
0 0
1 1
2 2
3 3
4 4
5 5
6 6
7 0
8 1 
9 2...

(a + b) % mod = ((a % mod) + (b % mod)) % mod
(a * b) % mod = ((a % mod) * (b % mod)) % mod
(a - b) % mod = ((a % mod) - (b % mod) + mod) % mod
(a / b) % mod = ((a % mod) * (inv(b) % mod)) % mod



modular inverse

a * (inv(a)) % mod = 1

1/5 % 7

5 * 3 % 7 = 1

inv(5) = 3

for(int i = 1; i < n; i++) {
	if(x * i % mod == 1) {
		// basic approach 
		// i will be inverse of X
	}
}


returns inverse of A under M

int modInverse(int a, int m)
{
    int m0 = m;
    int y = 0, x = 1;
 
    if (m == 1)
        return 0;
 
    while (a > 1) {
        // q is quotient
        int q = a / m;
        int t = m;
 
        // m is remainder now, process same as
        // Euclid's algo
        m = a % m, a = t;
        t = y;
 
        // Update y and x
        y = x - q * y;
        x = t;
    }
 
    // Make x positive
    if (x < 0)
        x += m0;
 
    return x;
}


memory limit for arrays: 10^5 - 10^6

nCr = n!/ ((n-r)! r!)

factorial = [1........................n]

factorial = [1, 1, 2, 6, 24, 120, 720,......]

for(int i = 1;i <= n; i++) {
	factorial[i] = i * factorial[i-1] % mod;
}


nCr = factorial[n] * modInverse(factorial[n - r]) * modInverse(factorial[r]) % mod

    = factorial[n] * modInverse(factorial[n - r] * factorial[r] % mod) % mod





modPow()

a ^ b % mod

int x = 5, y = 6;
int z = x<<(y>>1);
What is the value of z?


x = 00000101
y = 00000110

y >> 1 = 00000011 = 3


x << 3 = 00101000

 = 40



1, 2, 4, 8, 16

00000001
00000010
00000100
00001000
00010000













