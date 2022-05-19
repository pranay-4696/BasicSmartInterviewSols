import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        	Scanner in=new Scanner(System.in);

		int a=in.nextInt();

			int b=in.nextInt();

		 long c=1;

		
        if(b==0)
		{
        System.out.println(1);
        }
        else{
         for(int i=0;i<b;i++)
             {
             c=c*a;
             }
            System.out.print(c);
            }
		
        
		
