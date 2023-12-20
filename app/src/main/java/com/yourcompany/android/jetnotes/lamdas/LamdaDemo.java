package com.yourcompany.android.jetnotes.lamdas;

public class LamdaDemo {
    public static void main(String[] args) {
    	//life b4 lamda
        PrintImpl printimp = new PrintImpl();
        printimp.print("page content");
        
        Teacher abdul = new Teacher();
        abdul.teach("android");
        
        //life after lamdas      
        
        Printable pable = (content) -> { System.out.println(content);};
        pable.print("my page content");
        
        Sayable syable = (s,n) -> { System.out.println(s + n);  };
        
        syable.greet("hi ", "abdul");
        
        Teachable t1 = (sub) -> {System.out.println("training on "+sub);};
        t1.teach("java");
        
    }
}
