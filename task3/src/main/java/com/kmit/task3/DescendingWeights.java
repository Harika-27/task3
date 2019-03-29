package com.kmit.task3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class DescendingWeights {
	    public static void main(String args[] ) throws Exception {
	        @SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        int[] a=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        ArrayList<Integer> b[]=new ArrayList[m];
	        for(int j=0;j<m;j++)
	        {
	            b[j]=new ArrayList<Integer>();
	        }
	        for(int i=0;i<n;i++)
	        {
	            int wt=a[i]%m;
	            b[wt].add(a[i]);
	        }
	        for(int i=m-1;i>=0;i--)
	        {
	            Collections.sort(b[i]);
	            for(int j=0;j<b[i].size();j++)
	            {
	                System.out.print(b[i].get(j)+" ");
	            }
	        }
	        

	    
	}

}
