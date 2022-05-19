import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
         long f=1;
        if(n==0)
               System.out.print(f);
        else if(n>0)
        {
            for(long i=1;i<=n;i++)
                f=f*i;
            System.out.print(f);
        }
    }
}
