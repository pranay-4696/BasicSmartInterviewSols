import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        	Scanner in=new Scanner(System.in);

		String n=in.next();

		Boolean t = false;

		for(int i=0;i<n.length();i++)

		{

		    char a=n.charAt(i);

		    if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'  || a=='A'|| a=='E' || a=='I' || a=='O' || a=='U'){
		    t=true;}
		    else{
            t=false;
            break;
		}}

		if(t){
		System.out.print("Yes");
        }
            else
            {
                
             System.out.print("No");
            }
    }
}
