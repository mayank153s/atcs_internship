/*package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fib
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn=new Scanner(System.in);
		String[] s=scn.nextLine().split(",");
		int max=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<s.length;i++){
		    int x=Integer.parseInt(s[i]);
		    if(x>max){
		        max=x;
		    }
		  }
		  int count=0;
		  int num1=0;
		  list.add(num1);
		  int num2=1;
		  list.add(num2);
		  int sum=num1+num2;
		  while(sum<=max){
		      num1=num2;
		      num2=sum;
		      sum=num1+num2;
		      list.add(sum);
		  }
		 
		 for(int i=0;i<s.length;i++){
		     if(list.contains(Integer.valueOf(s[i]))){
		         count++;
		     }
		 }
		 System.out.println(count);
		
		
	}
}
