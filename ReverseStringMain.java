/*
 * 2.	Write a method reverse() that receives a string str as a parameter 
 * and returns the characters in str in reverse order. Thus, 
 * if the value sent to reverse() is "I me ", the method returns " em I".
 */
package com.string.pll;
import java.util.Scanner;
import com.strings.bll.ReverseString;

public class ReverseStringMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//creating object
		
		ReverseString rs = new ReverseString();
		
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		
		
		System.out.println("Reverse: " + rs.reverse(s)); //print reverse String.
		
		sc.close();
	}

}
