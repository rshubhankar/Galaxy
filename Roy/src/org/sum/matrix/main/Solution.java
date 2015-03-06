package org.sum.matrix.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        for (int i = 0; i < n; i++) {
        	line = br.readLine();
        	System.out.println(matrixSum(Integer.parseInt(line)));
        }
	}

	private static long matrixSum(int size) {
		long hsum = 0, vsum = 0;
		for (int i = 0; i < size; i++) {
			vsum += hsum;
			hsum += i;
		}
		return 2 * (hsum + vsum);
	}
}
