import java.util.*;
import java.io.*;
import java.math.*; 
public class Ci
{
 public static void main(String []args)
  {
   double p = 10000;
   double r = 10;
   double t = 5;
   double ci = p*(Math.pow((1+r/100),t));
System.out.println(ci);  
}

}