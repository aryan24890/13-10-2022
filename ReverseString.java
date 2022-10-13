package com.strings.bll;

public class ReverseString {

	// method to reverse String..
	public String reverse(String str) {
		
		char ch[]=str.toCharArray(); // conver String in a character..
		
		String rev = "";	// creating string variable and initialize as empty
		
		for(int i=ch.length-1; i>=0; i--) {
			rev = rev+ch[i];	// adding reverse char in rev Stirng
		}
		
		return rev; 	//return reverse String
		
	}

}
