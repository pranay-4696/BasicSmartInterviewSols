import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long i=0,c=0;
       i=n/3;
       c=n/5;
       long j=n/15;
        c=c+i-j;
        System.out.print(c);
    }
}
