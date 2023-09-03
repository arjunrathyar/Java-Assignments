package com.nissan.app;

import java.util.Scanner;

import com.faith.propel.java.camp4.Rectangle;
import com.faith.propel.java.camp4.Shape;
import com.faith.propel.java.camp4.Square;

public class Q1Main {

	static Rectangle rect[] = new Rectangle[5];
	static Square sqr[] = new Square[5];

	public static float calculateArea(Shape s) {
		return s.area();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rectangle = new Rectangle(4, 5);
		Shape square = new Square(5);

		System.out.println("Area of hardcoded Square: " + calculateArea(square));
		System.out.println("Area of hardcoded Rectangle: " + calculateArea(rectangle));

		Scanner scan = new Scanner(System.in);

		char ch = 'n';
		int i = 0;

		do {
			System.out.println("Enter the length and breadth for the rectangle as well as the side for the square!!");
			System.out.println("Enter the length: ");
			float l = Float.parseFloat(scan.next());
			System.out.println("Enter the breadth: ");
			float b = Float.parseFloat(scan.next());
			rect[i++] = new Rectangle(l, b);
			System.out.println("Enter the side: ");
			float s = Float.parseFloat(scan.next());
			i--;
			sqr[i++] = new Square(s);
			if (i == 5) {
				break;
			}
			System.out.println("Do you want to continue?(Y/N)");
			ch = scan.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

		System.out.println("Rectangle Area");
		for (Rectangle r : rect) {
			try {
				System.out.println(calculateArea(r));
			} catch (NullPointerException e) {

			}
		}

		System.out.println("Square Area");
		for (Square sq : sqr) {
			try {
				System.out.println(calculateArea(sq));
			} catch (NullPointerException e) {

			}
		}

	}

}
