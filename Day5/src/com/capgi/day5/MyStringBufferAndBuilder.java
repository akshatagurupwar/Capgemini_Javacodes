package com.capgi.day5;

//String  
//used to store the string value
//immuteable
//it is not thread safe
//StringBuffer
//used to store the string value
//not immunatabe
//not thread safe
//StringBuilder
//used to store the string value 
//not immunable
//thread safe
public class MyStringBufferAndBuilder {

	public static void main(String arg[]) {
		String str = "Hello";
		// new string value
		// str="Hello Java";
		str = str.concat(" Java");
		System.out.println(str);
		// cannot used as data type
		// StringBuffer used with new keyword
		// Not Thread safe(any number of thread can use this method)
		StringBuffer sbf = new StringBuffer("Hello");
		sbf.append(" java");
		System.out.println(sbf);
      //delete in string
		sbf.delete(2, 5);
		   System.out.println(sbf);

		System.out.println(sbf.lastIndexOf(str));
        sbf.deleteCharAt(0);

	   System.out.println(sbf);
       sbf.trimToSize();
       sbf.substring(1,3);
	   System.out.println(sbf);
       System.out.println(sbf.substring(1,5));
		//Only One Thread can use this at a time
		StringBuilder sb=new StringBuilder("Hello Java");
       System.out.println(sb);
       sb.append(" Hello");
      //
       System.out.println(sb);
	}

}
