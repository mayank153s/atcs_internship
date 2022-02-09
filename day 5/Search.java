import java.util.*;
import java.io.*;
import java.math.*; 
public class Search
{
 public static void main(String []args)
  { 
 int [] arr= new int[10];
  arr[0]=45;
arr[4]=54;
arr[1]=67;
arr[6]=7;
arr[2]=245;
int k=0;
for(int i=0;i<10;i++){
if(arr[i]==7){
k=i;
break;
}  
}
System.out.println("7 was found at index "+k);  




}

}