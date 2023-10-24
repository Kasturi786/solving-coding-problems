//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    
    
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
       
       
       for(int i = 0; i<k; i++) {
            
          int smallest = smallest(arr, l, r);
          int temp = arr[i];
          arr[i] = arr[smallest];
          arr[smallest] = temp;
          l = l+1;
          
       }
       return arr[k-1];
    }
    
    private static int smallest(int[] arr, int l, int r) {
          
        if(l==r)
          return l;
          
        int x = smallest(arr, l, (l+r)/2);
         
        int y = smallest(arr, (l+r)/2+1, r);
          
        int result =  arr[x]>arr[y] ? y:x;
         
        return result;
              
    } 
       
    

     
       
}
