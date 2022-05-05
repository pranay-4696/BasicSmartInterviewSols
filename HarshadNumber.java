import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=n;
        int sum=0;
      /*  while(n!=0){
            sum+=n%10;
            n=n/10;
            }
            */
         String s=Integer.toString(n);
            for(int i=0;i<s.length();i++)
                {
            char a=s.charAt(i);
                sum+=a-'0';
                }
        if(n%sum==0)
            System.out.print("Yes");
       else
    System.out.print("No");
        }
    catch(Exception e)
    {
        return;
        }
 
}}
