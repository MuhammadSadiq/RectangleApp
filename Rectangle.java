import java.util.Scanner;

public class Rectangle {
	
	private double length;
	private double height;
	
	
	
	
	public Rectangle(double lengthIn, double heightIn){
		length = lengthIn;
		height = heightIn;
	}
	public void setLength(double lengthIn){
		length = lengthIn;
	}
	public double getLength(){
		return length;
	}
	public void setHeight(double heightIn){
		height = heightIn;
	}
	public double getHeight(){
		return height;
	}
	public double calculateArea(){
		return (height * length);
		
	}
	public double calculatePerimeter(){
		return 2 * (height + length);
	}
	

}
