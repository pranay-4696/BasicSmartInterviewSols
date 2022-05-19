import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  Scanner in=new Scanner(System.in);
        int w=in.nextInt();
        int l=in.nextInt();
        for(int i=1;i<=l;i++)
        {
            for(int j=1;j<=w;j++)
            {
                if(i==1|| j==1 || i==l || j==w)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
