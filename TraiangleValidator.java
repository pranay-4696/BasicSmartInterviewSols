import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        long a=in.nextLong();
        long b=in.nextLong();
        long c=in.nextLong();
        if(a<=0 || b<=0 || c<=0)
             System.out.print("No");
        else if(a+b<=c || b+c<=a || c+a<=b)
            System.out.print("No");
     /*   else if(b+c>a)
            System.out.print("Yes");
        else if(c+a>b)
            System.out.print("Yes");   */
        else
            System.out.print("Yes");
    }
}
