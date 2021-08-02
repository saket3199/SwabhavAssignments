package com.proxy.pattern;

public class RealImage implements Image{

	private String fileName;

	   public RealImage(String fileName){
	      this.fileName = fileName;
	      loadFromDisk(fileName);
	   }


	   private void loadFromDisk(String fileName){
	      System.out.println("Loading " + fileName);
	   }

	@Override
	public void Display() {
		// TODO Auto-generated method stub
	      System.out.println("Displaying " + fileName);

		
	}

}
