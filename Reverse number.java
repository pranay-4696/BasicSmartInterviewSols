import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long s=0;
        while(n!=0)
        {
            s=s*10+n%10;
            n=n/10;
        }
        System.out.print(s);
    }
}
