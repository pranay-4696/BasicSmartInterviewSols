import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);

		String n=in.nextLine();

		char o=in.next().charAt(0);

	int c=0;

		for(int i=0;i<n.length();i++)

		{

		    if(n.charAt(i)==o)

		    c++;

		}

		System.out.print(c);
    }
}
