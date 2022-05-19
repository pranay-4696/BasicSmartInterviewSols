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
        int l=no(n);
        int sum=0;
        int k=n;
        while(n!=0)
            {
            int r=n%10;
            sum+=(int)Math.pow(r,l);
            n=n/10;
            }
        if(sum==k)
        System.out.print("Yes");
         else
        System.out.print("No");
    }
    static int no(int n)
        {
        int r=0;
        while(n>0)
            {
            r++;
            n=n/10;
            }
        return r;
        }
}
