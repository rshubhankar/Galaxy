package org.function.bool.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int t = Integer.parseInt(line);
        for (int i = 0; i < t; i++) {
        	line = br.readLine();
        	System.out.println(isSpecial(Integer.parseInt(line)).toString().toUpperCase());
        }
	}

	private static Boolean isSpecial(int num) {
		int primeCount = 0;
		for (int i = 1; i < num; i++) {
			boolean relativePrime = findGCD(num, i) == 1;
			if(relativePrime) {
				primeCount++;
			}
		}
		return primeCount > 1 && isPrimeNumber(primeCount);
	}
	
	private static int findGCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }

	private static boolean isPrimeNumber(int num) {
		boolean prime = true;
		for (int j = 2; j <= num / 2; j++) {
			if(num%j==0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
}
