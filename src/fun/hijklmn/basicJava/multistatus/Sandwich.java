package fun.hijklmn.basicJava.multistatus;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc:polymorphism with construct
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 18, 2019-11:42:00 AM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.multistatus
 * @Projectname:basicJava
 * @Filename:Sandwich.java
 * @Tags:
 */
public class Sandwich extends PortableLunch{

	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	
	private Pickle p = new Pickle();
	
	public Sandwich(){
		println("Sandwich()");
	} 
	
	public static void main(String[] args) {
		new Sandwich();
	}
	
}

class Meal{
	public Meal() {
		println("Meal()");
	}
}

class Bread{
	public Bread() {
		println("Bread()");
	}
}

class Cheese{
	public Cheese(){
		println("Cheese()");
	}
}

class Lettuce{
	public Lettuce(){
		println("Lettuce()");
	}
}

class Lunch extends Meal{
	public Lunch() {
		println("Lunch()");
	}
}

class Pickle{}


class PortableLunch extends Lunch{
	public	PortableLunch(){
		println("PortableLunch()");
	}
}