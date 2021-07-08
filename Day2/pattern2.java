package com.techlab.assignment;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=4;j++)
			{
				if(i>=j)
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}