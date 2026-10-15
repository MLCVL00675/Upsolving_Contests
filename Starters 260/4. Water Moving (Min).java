

// # Water Moving (Min)

// You have N cups of water, with the i-th cup containing A[i] amount of water.

// In one operation, you can do the following:

// - Choose two distinct cups i and j (1 ≤ i, j ≤ N, i ≠ j), such that cup i has a non-zero amount of water.
// - Move all the water from cup i to cup j.
// - After the operation, cup i contains 0, and cup j contains A[i] + A[j] amount of water.

// You must perform exactly K operations. Minimize the maximum amount of water in any cup at the end of the operations, and report this minimum value.

// ## Input Format

// - The first line contains a single integer T, denoting the number of test cases.
// - Each test case consists of multiple lines:
//   - The first line contains two integers N and K.
//   - The second line contains N integers: A[1], A[2], ..., A[N].

// ## Output Format

// For each test case, output the minimum possible maximum amount of water in any cup after exactly K operations.

// ## Constraints

// - 1 ≤ T ≤ 100
// - 2 ≤ N ≤ 100
// - 1 ≤ K ≤ 100
// - 1 ≤ A[i] ≤ 100

// ## Sample Input
// 3
// 2 1
// 3 1
// 5 2
// 1 2 3 4 5
// 3 100
// 3 2 2
// 

// ## Sample Output
// 
// 4
// 5
// 4
// 

// ## Explanation

// Test Case 1: Move the water from cup 1 to cup 2 in one operation. The array becomes [0, 4].

// Test Case 2: Perform the following two operations:
// - Move the water from cup 1 to cup 2.
// - Move the water from cup 3 to cup 4.

// The final array is [0, 5, 0, 5, 5], and the maximum amount of water is 5.

import java.util.*;
import java.lang.*;
import java.io.*;


public class Main 
{
    static int smallestPeak(int[] amounts) 
    {
        Arrays.sort(amounts);
        int combinedSmallest = amounts[0] + amounts[1];
        int heaviestCup = amounts[amounts.length - 1];
        return Math.max(combinedSmallest, heaviestCup);
    }

    public static void main(String[] args) {
        Scanner input;
        int numCases,caseNo,numCups,numOps, k;
        int[]amounts;
        StringBuilder lines;

        input = new Scanner(System.in);
        lines = new StringBuilder();
        numCases = input.nextInt();

        for (caseNo =0;caseNo < numCases;caseNo++) 
        {
            numCups = input.nextInt();
            numOps = input.nextInt();
            amounts = new int[numCups];
            for (k=0;k < numCups;k++) {
                amounts[k] = input.nextInt();
            }
            lines.append(smallestPeak(amounts)).append("\n");
        }
        System.out.print(lines);
    }
}