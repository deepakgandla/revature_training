package thursdayproblems;

import java.util.Arrays;

public class NthMaximum {
     public static void main(String args[]) {
    	 int a[]  = {4, 10, 1 , 2, 90, 2};
    	 System.out.println(nthMax(a, 2));
     }
     
     public static int nthMax(int arr[], int n) {
    	 for(int i=0;i<arr.length;i++) {
    		 for(int j=0;j<arr.length-1;j++) {
    			 if(arr[j]<arr[j+1]) {
    				 int temp = arr[j];
    				 arr[j] = arr[j+1];
    				 arr[j+1] = temp;
    			 }
    		 }
    	 }
         System.out.println(Arrays.toString(arr));
    	 
    	 int count = 0;
         for(int i=0;i<arr.length-1;i++) {
    			 if(arr[i]!=arr[i+1]) {
    				 count++;
    			 }
    			 if(count==n)break;
    		 }
    	 return arr[count-1];
     }
}
