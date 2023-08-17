



// public class kadanes {


//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4 ,5};

//         int n = arr.length;

//         // Generate all subarrays
//         for (int i = 0; i < n; i++) {
//             for (int j = i; j< n; j++) {
//                 // Print current subarray
//                 for (int k = i; k <= j; k++) {
//                     System.out.print(arr[k] + " ");
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }

class Solution{

    // arr: input array
    // n: sifze of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
           long max=0; long maxi=arr[0];
           
           for(int i=0;i<n;i++){
               
               max=max+arr[i];
               maxi=(maxi>max)? maxi : max;
               if(max<0) max=0;
               
           }
        
          return maxi;
        
        
    }
    
}
