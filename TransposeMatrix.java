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
    int m=in.nextInt();
    int[][] a=new int[n][m];
        int[][] b=new int[m][n];
    for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
    a[i][j]=in.nextInt();
        
for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        b[i][j]=a[j][i];
        for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
        System.out.print(b[i][j]+" ");}
        System.out.println();
        }
    }
}
