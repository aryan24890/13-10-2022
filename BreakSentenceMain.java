package com.strings.bll;

import com.string.pll.BreakSentence;

public class BreakSentenceMain {

	public static void main(String[] args) {
		BreakSentence bs = new BreakSentence();
		String str = "Hello, aryan how are you. ";
		
		//break method part
		System.out.println("*****Break word*******");
		
		String[] breaks =bs.breakWord(str);//breaking the words
		
			for(int i=0; i<breaks.length; i++) {//printing Each words
				System.out.println(breaks[i]);
			}
		
		//sortword method part
		System.out.println("****sorting Words*****");
		
		String[] sorting = bs.sortWord(str);// sorting the words
			for(int i=0; i<sorting.length; i++) { // printing sort words
				System.out.println(sorting[i]);
			}
		

	}

}
