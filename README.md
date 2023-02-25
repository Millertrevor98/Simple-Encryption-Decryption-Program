# Simple-Encryption-Decryption-Program

Very easy starter program for beginners. All you have to do is create an int key that is going to change the cipher code when it runs.
Next thing is to create a String and make up anything you want to put in it, then make a for loop with the chars variable and add += or -= to increment or decrement
the message. To encrypt message use += then write a string, to decrypt take the output of the encrytion and paste it as a string.



//Encrypt
package com.encrypt;

public class Main {

    public static void main(String[] args) {
        //change the key to get different encryption codes
	int key= 5;
    String sent="Hello World";
    char[] chars= sent.toCharArray();
    for(char x:chars){
        //increment or decrement the key to encrypt or decrypt the message
        x+=key;
        System.out.print(x);
    }
    }
}



//Decrypt
package com.encrypt;

public class Main {

    public static void main(String[] args) {
        //change the key to get different encryption codes
	int key= 5;
    String sent="s#*ly@ud";
    char[] chars= sent.toCharArray();
    for(char x:chars){
        //increment or decrement the key to encrypt or decrypt the message
        x-=key;
        System.out.print(x);
    }
    }
}
