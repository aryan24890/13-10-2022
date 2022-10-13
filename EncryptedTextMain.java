/*
 * 1.	 A class to encode texts specification: Realize a Java class to represent encrypted texts. The encryption of the text is obtained by replacing each character with the character whose code is equal to the code of the character to encode augmented by an integer number representing the encryption key. 

The functionalities of encrypted texts are: 
1.	creation of a new object that represents a text encrypted with a given encryption key; 
2.	creation of a new object that represents a text that is not encrypted (yet); 
3.	return of the encrypted text; 
4.	return of the decrypted text, provided the correct encryption key is provided; 
5.	verification of the correctness of an encryption key; 
6.	Modification of the encryption key; this is possible only if the correct key is provided.

 */
package com.strings.bll;

import com.string.pll.EncryptedText;

public class EncryptedTextMain {

	public static void main(String[] args) {
		//created object that represents a text encrypted 
		EncryptedText e = new EncryptedText("Eclipse is the best IDE", 10);
	
	//encrypted text
		System.out.println("ENCODE text : "+e.getEncryptedText());

	//decrypted text
		System.out.println("DECODE text : "+e.getDecryptedText(10));
		

	}

}
