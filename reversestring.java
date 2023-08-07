//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class reversestring
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        int l=0; int r=str.length()-1; char temp;

        char [] chararray=str.toCharArray(); //imp
        while(l<r)
        {
            
            temp=chararray[l];
            chararray[l]=chararray[r];
            chararray[r]=temp;
            l++;r--;
        }
         
         str= new String(chararray);
        
        return str;
         
    }
}