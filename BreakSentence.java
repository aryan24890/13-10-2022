package com.string.pll;

import java.util.ArrayList;
import java.util.List;

public class BreakSentence {
	
	//method for break
	public String[] breakWord(String str) {
		
		List<String> word = new ArrayList<String>(); 
		 
		char[] ch = str.toCharArray(); // String store in char array
		
		String strTemp = ""; 
		
		for (int i = 0; i < ch.length; i++) { 
			
			if (ch[i] != ' ') { 
				strTemp = strTemp + ch[i]; 
			} 
			else { 
				word.add(strTemp); 
				strTemp = ""; 
			} 
		}
		//create words array 
		String[] words = new String[word.size()];
		
		//store word in words array
		for (int i = 0; i < word.size(); i++) {
         words[i] = word.get(i);
		}
		
		return words; // return words array
		
		
	}	
		
		
	// Method for sorting words	
	public String[] sortWord(String str) {
		
		String[] words = str.split("\\s");
		
		int len = words.length;
		
		for(int i=1; i<len; i++) {
			String temp = words[i];
			int j= i-1;
			while(j>=0 && temp.length() < words[j].length()) {
				words[j+1] = words[j];
				j--;
			}
			words[j+1]=temp;
		}
		
		return words; // return sorting words
	}
		
}

	


