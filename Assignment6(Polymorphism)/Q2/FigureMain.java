package com.nissan.app;

import com.nissan.method.Rectangle;
import com.nissan.method.Figure;
import com.nissan.method.Triangle;

public class FigureMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rectangle = new Rectangle(3,4);
		Triangle triangle = new Triangle(5,6);

		System.out.print("Area of Rectangle: ");
		calculateArea(rectangle);

		System.out.print("Area of Triangle: ");
		calculateArea(triangle);
	}

	public static void calculateArea(Figure f) {
		float area = f.area();
		System.out.println(area);

	}

}
