import java.util.* ;
import java.io.*; 
public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
		int n = arr.length;
		int[] lsum = new int[n];
		int[] rsum = new int[n];

		lsum[0]=arr[0];
		for(int i=1;i<n;i++){
			lsum[i]=lsum[i-1]+arr[i];

		}

		rsum[n-1]=arr[n-1];
		for(int i = n-2;i>=0;i--){
			rsum[i]=rsum[i+1]+arr[i];
		}

		for(int i =0 ; i<n; i++){
			if(lsum[i]==rsum[i]){
				return i;
			}
		}

		return -1;
	}
}
