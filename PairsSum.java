package com.techlab.assignment;

public class PairsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArr[]= {4, 6, 5, -10, 8, 5, 20};
		int sum=10;
		for (int i = 0; i < myArr.length - 1; i++)
        {
            for (int j = i + 1; j < myArr.length; j++)
            {
                
                if (myArr[i] + myArr[j] == sum)
                {
                    System.out.println("Pair found (" + myArr[i] + ", " + myArr[j] + ")");
                }
            }
        }

	}

}
