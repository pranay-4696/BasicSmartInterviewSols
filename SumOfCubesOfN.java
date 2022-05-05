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
        int f=0;
        f=((n*n)*(n+1)*(n+1))/4;
        System.out.print(f);
    }
}
