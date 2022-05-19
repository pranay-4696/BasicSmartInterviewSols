import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        	Scanner in=new Scanner(System.in);

	

		String s=in.nextLine();

		int k=s.length();

		int[] arr=new int[k];

		int i=0,g=0;

		int j=0;

	for(i=0;i<k;i++)

	{

	    char ch=s.charAt(i);

	    for(j=i;j<k;j++)

	    {

	        if(s.charAt(j)==ch)

	        {

	            arr[i]+=1;

	            g++;

	        }

	        else

            {

            break;

            }

	    }

	}

//		System.out.println(s+"\n"+Arrays.toString(arr));

		i=0;

		while(i<k)

		{

		  System.out.print(s.charAt(i));

		  System.out.print(arr[i]);

		  i=i+arr[i];

		

		}
    }
}
