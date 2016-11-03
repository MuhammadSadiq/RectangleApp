import java.util.Scanner;

public class RectangleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Rectangle r;
		Rectangle r = new Rectangle(4.5, 5.6);
		
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("enter length :");
		double lengthIn = kbd.nextDouble();
		
		System.out.print("enter height: ");
		double heightIn = kbd.nextDouble();
		
		System.out.println("Area of rectangle : " + r.calculateArea());
		System.out.println("Perimeter is " +r.calculatePerimeter());
		

	}

}
