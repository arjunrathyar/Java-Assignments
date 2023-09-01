package com.nissan.app;

import com.nissan.method.Rectangle;
import com.nissan.method.Shape;
import com.nissan.method.Square;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rectangle = new Rectangle(3,4);
		Square square = new Square(5);

		System.out.print("Area of Rectangle: ");
		calculateArea(rectangle);

		System.out.print("Area of Square: ");
		calculateArea(square);
	}

	public static void calculateArea(Shape s) {
		double area = s.area();
		System.out.println(area);

	}

}
