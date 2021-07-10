//Now make changes in circle App Create 3 different object of circle and store it in circle array. ..
//Outside main create one method as printCircleInfo( Circle[] c) 
//To print all details of every object
//
//Task2:- create one method outside main () name it as findSmallestCircle(Rectangle[] r)
//This method will compare radius of all circles and will return the object of circle whose radius is smaller
//
//Task 3:-create one method outside main () name it as findBiggestCircleArea(Rectangle[] r)
//This method will compare area of all circles and will return the object of circle whose radius is smaller
//
//

package com.techlab.circle.test;

import com.techlab.circle.Circle3;

public class Circle3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle3[] c = new Circle3[4];
		Circle3 c1 = new Circle3();
		c1.setRadius(8.4f);
		c1.setColor("green");
		c[0] = c1;
		Circle3 c2 = new Circle3();
		c2.setRadius(6.7f);
		c2.setColor("black");
		c[1] = c2;
		Circle3 c3 = new Circle3();
		c3.setRadius(9.8f);
		c3.setColor("orange");
		c[2] = c3;
		Circle3 c4 = new Circle3();
		c4.setRadius(4.3f);
		c4.setColor("pink");
		c[3] = c4;
		printCircleInfo(c);
		findSmallestCircle(c);
		findLargestCircle(c);
	}

	public static void printCircleInfo(Circle3[] arrobj) {
		for (int i = 0; i < arrobj.length; i++) {
			System.out.println("radius of object "+(i+1) +"is : " + arrobj[i].getRadius());
			System.out.println("color of object " + (i + 1) + " is : " + arrobj[i].getColor());
		}
	}

	public static void findSmallestCircle(Circle3[] small) {
		float temp = small[0].getRadius();
		for (int i = 1; i < small.length; i++) {
			if (temp > small[i].getRadius())
				temp = small[i].getRadius();
		}
		System.out.println("smallest radius of circle of array object is : " + temp);
	}

	public static void findLargestCircle(Circle3[] large) {

		float temp = large[0].getRadius();
		for (int i = 1; i < large.length; i++) {
			if (temp < large[i].getRadius())
				temp = large[i].getRadius();
		}
		System.out.println("largest radius of circle of array object is : " + temp);

	}

	}


