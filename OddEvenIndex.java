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

	String s="";

	int k=n.length()/2;

	int j=1;

	int l=0;

		for(int i=0;i<n.length();i++)

		{

		    if(i<k){

		    s+=n.charAt(j);

		    j=j+2;	

			}

			else

         {

             s+=n.charAt(l);;

             l+=2;

         }		

		}

		System.out.print(s);
    }
}
