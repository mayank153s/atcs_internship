import java.io.*;
import java.util.*;
import java.io.*;
import java.math.*;

public class CountLettersInArray {
	static char[] arr;
//	public CountLettersInArray() {
//		// TODO Auto-generated constructor stub
//	}
	public static void createArray(){
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		arr=str.toCharArray(); 
	}
	public static void displayArray(){
		System.out.println(" char array:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void displayCount(){
		char[] ar = arr;
		for(int i=0;i<ar.length;i++){
			jj:
			{
			char x = ar[i];
			int count=0;
			if(ar[i]==0){
				break jj;
			}
			for(int j=0;j<ar.length;j++){
				if(x==ar[j]&& ar[j]!=0){
					count++;
					ar[j]=0;
				}
			}
			System.out.println(""+x+"  "+count);
			count=0;
		}
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountLettersInArray ca= new CountLettersInArray();
		ca.createArray();
		ca.displayArray();
		System.out.println("length of array:" +arr.length);
		ca.displayCount();
		
	}

}
