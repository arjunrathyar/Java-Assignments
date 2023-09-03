package com.nissan.app;

import com.nissan.model.Animals;
import com.nissan.model.Cat;
import com.nissan.model.Chicken;
import com.nissan.model.Crow;
import com.nissan.model.Dog;
import com.nissan.model.Goat;
import com.nissan.model.MyAnimals;

public class Main {

	public static void main(String[] args) {

		Animals c = new Cat();
		c.saySomething();
		c.cry();
		c.fly();
		c.setColor("White");
		c.setNoOfLegs(4);
		c.walk(c.getNoOfLegs());
		
		
		Animals d = new Dog();
		d.saySomething();
		d.cry();
		d.fly();
		d.setColor("Black and White");
		d.setNoOfLegs(4);
		d.walk(d.getNoOfLegs());
		
		
		Animals g1 = new Goat();
		g1.saySomething();
		g1.cry();
		g1.fly();
		g1.setColor("White");
		g1.setNoOfLegs(4);
		g1.walk(g1.getNoOfLegs());
		
		
		Animals c1 = new Crow();
		c1.saySomething();
		c1.cry();
		c1.fly();
		c1.setColor("Black");
		c1.setNoOfLegs(2);
		c1.walk(c1.getNoOfLegs());
		
		
		Animals c2 = new Chicken();
		c2.saySomething();
		c2.cry();
		c2.fly();
		c2.setColor("Brown");
		c2.setNoOfLegs(2);
		c2.walk(c2.getNoOfLegs());
		
		
		MyAnimals a = new MyAnimals();
		a.setBodyType(30);
		System.out.println("Body temperature is " + a.getBodyType());

	}

}
