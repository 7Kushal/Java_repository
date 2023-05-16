/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class knapsack{
	public static void main (String[] args) {
		int[] wt = {1,2,3,4};
		int[] value = {20,22,10,1};
		int w = 10;
		int n = 4;
		int[][] t = new int[n+1][w+1];
		for(int i=0;i<n+1;i++)
		Arrays.fill(t[i],-1);
		
		System.out.println(knapsack(wt,value,w,n,t));
	}
	
	static int knapsack(int[] wt,int[] value,int w,int n,int[][] t){
	    if(n==0||w==0)
	    return 0;
	    if(t[n][w]!=-1)
	    return t[n][w];
	    if(wt[n-1]<=w)
	    return t[n][w]=Math.max(value[n-1]+knapsack(wt,value,w-wt[n-1],n-1,t),knapsack(wt,value,w,n-1,t));
	    
	    else 
	    return t[n][w]=knapsack(wt,value,w,n-1,t);
	}
}