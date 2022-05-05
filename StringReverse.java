import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        	Scanner in=new Scanner(System.in);

        String s=in.next();

        String r="";

       int n=s.length();

       int k=n-1;

       for(int i=k;i>=0;i--)

       {

           r+=s.charAt(i);

           //char a=s.charAt(i);

//           s.charAt(i)=s.charAt(k-i);

//           s.charAt(k-i)=a;

//           k--;

          

       }

       System.out.println(r);
    }
}
