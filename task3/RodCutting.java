package com.kmit.task3;
import java.util.*;
public class RodCutting {
	    public static void main(String args[] ) throws Exception {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	while(n>0)
	{
	    int h=sc.nextInt();
	    int c=0;
	    int i=3;
	    while(i<=h)
	    {
	        c+=1;
	        i=2*i+1;
	    }
	    n--;
	    System.out.println(c);
	}

	
	}


}
