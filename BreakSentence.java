package com.string.pll;

public class BreakSentence {
	
	//method for break
	public String[] breakWord(String str) {
		String[] words = str.split("\\s");
		
		/* words;
		String word= "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ') {
				char ch[] = str.toCharArray();
				 
			}
			String[] words = words+ch[i];
		}*/
		
		return words;
		
		
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

	


