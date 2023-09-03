package com.nissan.app;

import com.faith.propel.java.camp4.Cat;
import com.faith.propel.java.camp4.Dog;
import com.faith.propel.java.camp4.MyAnimals;

public class Q3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyAnimals m = new MyAnimals();
		m.setBodyTemp(30);
		System.out.println("Body temperature using m.getBodyTemp() after m.setBodyTemp(30): "+m.getBodyTemp());
		System.out.println("Body temperature using m.GetBodyTemp(\"32\"): "+m.GetBodyTemp("32"));
		Cat c = new Cat();
		c.saySomething();
		Dog d = new Dog();
		d.saySomething();
		m.saySomething();

	}

}
