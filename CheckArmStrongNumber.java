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

			int r,sum=0;

	int k=n;

	while(n>0)

	{

		r=n%10;

		sum+=r*r*r;

		n=n/10;

	}

	if(k==sum)

	System.out.println("Yes");

	else

    System.out.println("No");
    }
}
