package org.texting.robot.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	private static Map<String, Integer> countPressMap = new HashMap<String, Integer>();
	private static Map<String, Integer> keyPadMap = new HashMap<String, Integer>();
	
	public static void main(String[] args) throws Exception {
		if(countPressMap.isEmpty()) {
			init();
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        for (int i = 0; i < n; i++) {
        	line = br.readLine();
        	System.out.println(process(line, i));
        }
	}

	private static int process(String line, int i) {
		int currentPos = 1;
		int sum = 0;
		for (int j = 0; j < line.length(); j++) {
			String ch = line.charAt(j) + "";
			int keyPadPos = keyPadMap.get(ch.toLowerCase());
			if(keyPadPos != currentPos) {
				sum++;
				currentPos = keyPadPos;
			}
			sum += countPressMap.get(ch.toLowerCase());
		}
		return sum;
	}
	
	private static void init() {
		countPressMap.put("a", 1);
		countPressMap.put("b", 2);
		countPressMap.put("c", 3);
		countPressMap.put("d", 1);
		countPressMap.put("e", 2);
		countPressMap.put("f", 3);
		countPressMap.put("g", 1);
		countPressMap.put("h", 2);
		countPressMap.put("i", 3);
		countPressMap.put("j", 1);
		countPressMap.put("k", 2);
		countPressMap.put("l", 3);
		countPressMap.put("m", 1);
		countPressMap.put("n", 2);
		countPressMap.put("o", 3);
		countPressMap.put("p", 1);
		countPressMap.put("q", 2);
		countPressMap.put("r", 3);
		countPressMap.put("s", 4);
		countPressMap.put("t", 1);
		countPressMap.put("u", 2);
		countPressMap.put("v", 3);
		countPressMap.put("w", 1);
		countPressMap.put("x", 2);
		countPressMap.put("y", 3);
		countPressMap.put("z", 4);
		countPressMap.put("0", 2);
		countPressMap.put("1", 5);
		countPressMap.put("2", 4);
		countPressMap.put("3", 4);
		countPressMap.put("4", 4);
		countPressMap.put("5", 4);
		countPressMap.put("6", 4);
		countPressMap.put("7", 5);
		countPressMap.put("8", 4);
		countPressMap.put("9", 5);
		countPressMap.put("_", 1);
		countPressMap.put(".", 1);
		countPressMap.put(",", 2);
		countPressMap.put("?", 3);
		countPressMap.put("!", 4);
		
		keyPadMap.put("a", 2);
		keyPadMap.put("b", 2);
		keyPadMap.put("c", 2);
		keyPadMap.put("d", 3);
		keyPadMap.put("e", 3);
		keyPadMap.put("f", 3);
		keyPadMap.put("g", 4);
		keyPadMap.put("h", 4);
		keyPadMap.put("i", 4);
		keyPadMap.put("j", 5);
		keyPadMap.put("k", 5);
		keyPadMap.put("l", 5);
		keyPadMap.put("m", 6);
		keyPadMap.put("n", 6);
		keyPadMap.put("o", 6);
		keyPadMap.put("p", 7);
		keyPadMap.put("q", 7);
		keyPadMap.put("r", 7);
		keyPadMap.put("s", 7);
		keyPadMap.put("t", 8);
		keyPadMap.put("u", 8);
		keyPadMap.put("v", 8);
		keyPadMap.put("w", 9);
		keyPadMap.put("x", 9);
		keyPadMap.put("y", 9);
		keyPadMap.put("z", 9);
		keyPadMap.put("0", 0);
		keyPadMap.put("1", 1);
		keyPadMap.put("2", 2);
		keyPadMap.put("3", 3);
		keyPadMap.put("4", 4);
		keyPadMap.put("5", 5);
		keyPadMap.put("6", 6);
		keyPadMap.put("7", 7);
		keyPadMap.put("8", 8);
		keyPadMap.put("9", 9);
		keyPadMap.put("_", 0);
		keyPadMap.put(".", 1);
		keyPadMap.put(",", 1);
		keyPadMap.put("?", 1);
		keyPadMap.put("!", 1);
	}
}
