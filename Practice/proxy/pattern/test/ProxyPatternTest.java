package com.proxy.pattern.test;

import com.proxy.pattern.Image;
import com.proxy.pattern.ProxyImage;

public class ProxyPatternTest {
	public static void main(String[] args) {
	      Image image = new ProxyImage("test_10mb.jpg");

	      //image will be loaded from disk
	      image.Display(); 
	      System.out.println("");
	      
	      //image will not be loaded from disk
	      image.Display(); 	
	   }

}
