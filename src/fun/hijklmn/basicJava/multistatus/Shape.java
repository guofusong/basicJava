package fun.hijklmn.basicJava.multistatus;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc:object up cast
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 16, 2019-11:48:10 AM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.multistatus
 * @Projectname:basicJava
 * @Filename:Shape.java
 * @Tags:
 */
public class Shape {

	public void draw() {}
	public void erase() {}
	public void notice() {
		println("Shape.fillcolor()");
	}
	
}

class Circle extends Shape{
	
	public void draw() {
		println("Circle.draw()");
	}
	
	public void erase() {
		println("Ciecle.erase()");
	}
	
	public void notice() {
		println("Circle.fillcolor()");
	}
	
}

class Square extends Shape{
	
	public void draw() {
		println("Square.draw()");
	}
	
	public void erase() {
		println("Square.erase()");
	}
	
}

class Triangle extends Shape{
	
	public void draw() {
		println("Triangle.draw()");
	}
	
	public void erase() {
		println("Triangle.erase()");
	}
	
}
