import java.io.*;
import java.util.*;

public class Solution {
   //16 pts only
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        int i=in.nextInt();
        String s=Long.toBinaryString(n);
      // System.out.println(s.length());
        int p=s.length()-1-i;
        if(s.charAt(p)=='1')
         System.out.println("true");
        else if(s.charAt(p)=='0')
             System.out.println("false");
        
    }
}
