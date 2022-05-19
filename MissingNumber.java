import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int[] arr=new int[100];
        int s=0;
        int k=5050;
       for(int i=0;i<99;i++)
       {
           arr[i]=in.nextInt();
           s+=arr[i];
       }
        System.out.print(k-s);
    }
}
