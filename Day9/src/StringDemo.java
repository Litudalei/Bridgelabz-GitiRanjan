package com.test;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="hello";
      char[]  ch=s.toCharArray();
     /* String rev="";
      for(int i=ch.length-1;i>=0;i--)
      {
    	  rev=rev+ch[i];
      }
      System.out.println("reverse of the string"+rev);*/
      
      
      int left=0;
      int right=ch.length-1;
      while(left<right)
      {
    	char  temp=ch[left];
    	  ch[left]=ch[right];
    	  ch[right]=temp;
    	  left++;
    	  right--;
      }
      System.out.println(ch);
	}

}
