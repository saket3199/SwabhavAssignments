// Create new class as PatternTest.java 
// And write logic to print following pattern:- 

// 1
// 1 1
// 1 1 1 
// 1 1 1 1
package com.techlab.assignment;

public class PatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j<=i)
					System.out.print("1 ");

			}
			System.out.println("");
		}

	}

}
