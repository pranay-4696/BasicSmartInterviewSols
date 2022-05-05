import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);

        int m=in.nextInt();

        int n=in.nextInt();

        int[][] a=new int[m][n];

        for(int i=0;i<m;i++)

            for(int j=0;j<n;j++)

                a[i][j]=in.nextInt();

        int c=0;

        for(int i=0;i<n;i++)

            {

            c=0;

            for(int j=0;j<m;j++)

                {

                c+=a[j][i];

                }

            System.out.println(c);

            }

    }
    }
