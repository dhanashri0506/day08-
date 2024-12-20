package day07;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner xy = new Scanner(System.in);
		System.out.println("Enter the three sides of traingle:");
		int a= xy.nextInt() ,b= xy.nextInt() , c=xy.nextInt();
		System.out.println("Area of triangle is:"+(a+b+c));

	}

}
