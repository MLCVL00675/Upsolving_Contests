

// SOLVED BUT IT IS A GOOD MATH QUESTION 


// You are given an integer N. Count the number of pairs (X, Y) such that:

// 1 ≤ X < Y ≤ N

// gcd(X, Y) = |X − Y|

// where gcd(A, B) denotes the greatest common divisor of both A and B.

// ### Input Format
// - The first line contains a single integer T, denoting the number of test cases.
// - Each test case contains a single integer N.

// ### Output Format
// For each test case, output the number of pairs (X, Y) satisfying the conditions.

// ### Constraints
// - 1 ≤ T ≤ 100
// - 2 ≤ N ≤ 10⁹

// ### Sample Input
// 4
// 2
// 3
// 4
// 10

// ### Sample Output
// 1
// 2
// 4
// 17

// ### Explanation
// Test Case 1: (1, 2) is the only valid pair.

// Test Case 2: (1, 2) and (2, 3) are the valid pairs.

import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            long N = sc.nextLong();
            long M = N / 2;
            long ans = 0;
            long l = 1;

            while (l <= M) {
                long q = N / l;
                long r = Math.min(M, N / q);

                ans += (q-1) * (r - l +1);
                l = r + 1;
            }
            System.out.println(ans);
        }
    }
}