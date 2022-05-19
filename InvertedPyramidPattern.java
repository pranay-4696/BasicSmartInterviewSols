import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner (System.in);
        int n=in.nextInt();
        	for(int i=1;i<=n;i++)

		{

		    for(int j=1;j<=n-i+1;j++)

		    {

		        if(j==1 || i==1 || j==n-i+1)

		        System.out.print("* ");

		        else

                System.out.print("  ");

		    }

		    System.out.println();

		}
    }
}
