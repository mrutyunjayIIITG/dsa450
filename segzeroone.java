public class segzeroone {

 public static void show(int[] arr)
 {
   
     for(int element:arr)
     {
        System.out.println(element);
     }

 }



public static void main(String[] args)
{
    int[] arr={0,1,0,1,0,1,0};
    int size=arr.length;
   // System.out.println(size);
   int l=0;int  r =size-1;
   while(l<=r){
         if(arr[l]==0 && arr[r]==1){
            l++;r--;
         }
         else if(arr[l]==1 && arr[r]== 0){
             arr[l]=0; arr[r]=1;
             l++;r--;
         }
         else if(arr[l]==0 && arr[r]== 0)
         {
            l++;
         }
         else if(arr[l]==1 && arr[r]== 1)
         {
            r --;
         }
   }
     




    show(arr);
}




}