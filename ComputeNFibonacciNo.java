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

		int a=0;

		int b=1;

		int c=0;
if(n==1)
    System.out.println(a+b);
        else{
		for(int i=1;i<n;i++)

		{

		    c=a+b;

		    a=b;

		    b=c;		   

		}

		System.out.println(c);
    }}
}
