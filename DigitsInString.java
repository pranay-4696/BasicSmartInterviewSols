import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner in=new Scanner(System.in);
    String s=in.nextLine();
        boolean t=true;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!(ch>=48 && ch<=57)){
                System.out.print("No");
                t=false;
                break;}
            else
                t=true;
        }
        if(t)
            System.out.print("Yes");
    }
}
