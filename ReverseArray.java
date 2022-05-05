import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        	Scanner in=new Scanner(System.in);

				 int n=in.nextInt();

		
long a[]=new long[n];
		for(int i=0;i<n;i++)

		a[i]=in.nextLong();

		 int k=a.length-1;
         int m=k+1;
		 for(int i=0;i<m/2;i++)
             {
             long t=a[i];
             a[i]=a[k];
             a[k]=t;
             k--;
             }
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");

    }
}
