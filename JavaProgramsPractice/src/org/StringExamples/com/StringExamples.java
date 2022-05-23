package org.StringExamples.com;

public class StringExamples {
	
	public static void main(String args[]) {

        String str1="Java";
        String str2=new String("Java");
        String str3=new String("Java");
        String str4="Java";
        
        System.out.println(str1==str4);//true --"" created with literals
        System.out.println(str1==str2); //  false coz comparing refrences of strings
        System.out.println(str1.equals(str2)); // true coz, comapring values of string
        System.out.println(str2==str3); // false, coz comparing refrences of strings
        System.out.println(str1==str4); // true --"" created with literals
        
        String s1 = new String("coding");
        String s2 = new String("CODING");
        //Assigning value of s2 to s1 and printing s1
        System.out.println(s1 = s2);
        int a =5;
        int b =6;
        System.out.println(a=b);
        
        
//        System.out.println(str1.hashCode());
//        System.out.println(str2.hashCode());
//        System.out.println(str3.hashCode());
//        System.out.println(str4.hashCode());
//        
        
        //-------------------------------------
        
//        String s = null;
//        if ("hello".equals(s))
//        {
//          System.out.println("done!");
//        }
//        System.out.println("finished!");
//        }
    }
}


