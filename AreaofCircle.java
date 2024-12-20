package day07;
import java.util.Scanner;
public class AreaofCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner ab = new Scanner(System.in);
	        System.out.print("Enter the radius of the circle: ");
	        double radius = ab.nextDouble();
	        System.out.println("The area of the circle is: " + (Math.PI * radius * radius));
	}

}
