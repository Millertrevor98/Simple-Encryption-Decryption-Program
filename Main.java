package com.encrypt;

public class Main {

    public static void main(String[] args) {
        //change the key to get different encryption codes
	int key= 5;
    String sent="Deez Nutz";
    char[] chars= sent.toCharArray();
    for(char x:chars){
        //increment or decrement the key to encrypt or decrypt the message
        x+=key;
        System.out.print(x);
    }
    }
}
