package org.boxes.coin.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        int[] array = new int[n];
        line = br.readLine();
        int m = Integer.parseInt(line);
        int lowerBound = n - 1, upperBound = 0;
        for (int i = 0; i < m; i++) {
        	line = br.readLine();
        	String[] range = line.split(" ");
        	int localLowerBound = Integer.parseInt(range[0]) - 1;
        	if(localLowerBound < lowerBound) {
        		lowerBound = localLowerBound;
        	}
        	
			int localUpperBound = Integer.parseInt(range[1]);
			if(localUpperBound > upperBound) {
        		upperBound = localUpperBound;
        	}
			
			for(int j = localLowerBound; j < localUpperBound; j++) {
        		array[j]++;
        	}
			
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j] + " ");
			}
        }
        line = br.readLine();
        int q = Integer.parseInt(line);
        for (int i = 0; i < q; i++) {
        	line = br.readLine();
        	int limit = Integer.parseInt(line);
        	int count = 0;
        	for(int j = lowerBound; j < upperBound;j++) {
        		if(array[j] >= limit) {
        			count++;
        		}
        	}
        	System.out.println(count);
        }
	}

}
