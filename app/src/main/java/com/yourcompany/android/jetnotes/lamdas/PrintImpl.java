package com.yourcompany.android.jetnotes.lamdas;
public class PrintImpl implements Printable {
   
	@Override
    public void print(String content) {
    	
        System.out.println(content);
    }
}
