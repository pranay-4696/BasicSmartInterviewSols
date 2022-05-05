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
        int k=in.nextInt();


        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int i=0,j=n-1;
       int mid=(i+j)/2;
        while(i<=j)
            {
            mid=(i+j)/2;
            if(a[mid]==k){
                System.out.print("true");
            break;}
            else if(k<a[mid])
                j=mid-1;
            else if(k>a[mid])
            i=mid+1;
            }
        if(i>j)
            System.out.print("false");
       
    }
}
