import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long[] arr =new long[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextLong();
        long k;
        for(int i=0;i<n;i++)
        {
            k=arr[i];
            for(int j=i;j<n;j++)
            {
            if(arr[j]==k && i!=j)
            {
            System.out.print(arr[j]);
            break;
            }
            }
        }
        
    }
}
