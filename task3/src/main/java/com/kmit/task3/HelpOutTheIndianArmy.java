package com.kmit.task3;

import java.io.*;
import java.util.*;
public class HelpOutTheIndianArmy {
	
	
	    public static void main(String args[] ) throws Exception
	    {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str[] = br.readLine().split(" ");
			int T = Integer.parseInt(str[0]);
			long S = Long.parseLong(str[1]), E = Long.parseLong(str[2]);
			Point points[] = new Point[T];
			for(int i=0;i<T;i++)
			{
				str = br.readLine().split(" ");
				long A = Long.parseLong(str[0]), B = Long.parseLong(str[1]);
				points[i] = new Point();
				points[i].x = A-B;
				points[i].y = A+B;
			}
			if(S==E)
			{
			    System.out.println(0);
			    return;
			    
			}
			Arrays.sort(points);
			long dist=0;
			for(int i=0;i<points.length && S<E && points[i].x<E;i++)
			{
				if(points[i].x>S) dist += points[i].x-S;
				if(points[i].y>S) S=points[i].y;
			}
			if(E-S>0) dist += E-S;
			System.out.println(dist);

			}
			static class Point implements Comparable<Point>
			{
			long x,y;
			public int compareTo(Point o) {
				return (x<o.x?-1:(x==o.x?0:1));
		}
	    }
	

}
