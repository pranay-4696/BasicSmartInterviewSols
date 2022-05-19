import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
         
            for(int j=n;j>=1;j--)
            {
                if(j==i)
                System.out.print("*");
                else
               System.out.print(j);
                
        }
            System.out.println();
        }
    }
}
