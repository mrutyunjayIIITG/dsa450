//
//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{

    public static void  swappos(int a[],int x, int y){
                    int temp=a[x];
                    a[x]=a[y];
                    a[y]= temp;
               
        
    }


    public static void sort012(int a[], int n)
    {
         
         int low=0; int mid =0;int high=n-1;
         while(mid<=high ){
            switch(a[mid]){
                           case 0:
                                 swappos(a,low,mid);
                                 low++; mid ++;
                                 break;
                            case 1:
                                mid++;
                                break;

                            case 2:
                                  swappos(a,mid,high);
                                  mid++; high--;
                                  break;
 



            }


         }




    }
}

//{ Driver Code Starts.

class sortzeroonetwo {
    
    public static void main (String[] args) throws IOException {
            
            int[] arr={0,1,2,0,1,2,0};
            int n =  arr.length; 
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }



// } Driver Code Ends