/*package codechef; // don't place package name! */
// 5 5
// 1 9 9 7 2
// 1 1 2 0 5
// 1 4 0 7 4
// 1 0 4 1 7
// 0 2 2 2 2
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Matrix
{  
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scn=new Scanner(System.in);
	    int row=scn.nextInt();
	    int col=scn.nextInt();
	    int [][]mat=new int[row][col];
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    for(int i=0;i<row;i++){
	        for(int j=0;j<col;j++){
	            mat[i][j]=scn.nextInt();
	        }
	    }
	    for(int i=0;i<row;i++){
	        for(int j=0;j<col;j++){
	            
	            if(j<=col-4){
	                int x=mat[i][j];
	                if(x==mat[i][j+1]&&x==mat[i][j+2]&&x==mat[i][j+3]){
	                    list.add(x);
	                }
	            }
	            
	            
	            if(i<=row-4){
	                int x=mat[i][j];
	                if(x==mat[i+1][j]&&x==mat[i+2][j]&&x==mat[i+3][j]){
	                    list.add(x);
	                }
	            }
	            
	            
	           if(j<=col-4&&i<=row-4){
	               int x=mat[i][j];
	               if(x==mat[i+1][j+1]&&x==mat[i+2][j+2]&&x==mat[i+3][j+3]){
	                list.add(x);
	               } 
	           }
	            
	            if(i>=3&&j<=col-4){
	               int x=mat[i][j];
	                if(x==mat[i-1][j+1]&&x==mat[i-2][j+2]&&x==mat[i-3][j+3]){
	                   list.add(x);
	                } 
	            }
	            
	        }
	    }
	    
	    if(list.size()==0){
	        System.out.println("-1");
	    }
	    else{
	        Collections.sort(list);
	        System.out.println(list.get(0));
	    }
	        
	}
}
