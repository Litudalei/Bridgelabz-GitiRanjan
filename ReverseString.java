package com.test;

public class ReverseString {

	public static void main(String[] args) {
		String s="Rohandas";
	String	revstring="";
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.println(s.charAt(i));
		revstring=revstring+s.charAt(i);
	}
	System.out.println("reverse of the string"+revstring);
	
		

	}

}
