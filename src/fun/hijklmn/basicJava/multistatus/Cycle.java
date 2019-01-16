package fun.hijklmn.basicJava.multistatus;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc:object up cast
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 16, 2019-11:29:24 AM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.multistatus
 * @Projectname:basicJava
 * @Filename:Cycle.java
 * @Tags:
 */
public class Cycle {

	public void run() {
		println("Cycle Run ");
	}
	
	public static void driver(Cycle c) {
		c.run();
	}
	
	public static void main(String[] args) {
		
		Cycle c = new Cycle();
		driver(c);
		Unicycle u = new Unicycle();
		driver(u);
		
		Cycle c1 = new Unicycle();
		c1.run();
				
	}
	
}

class Unicycle extends Cycle{
	
	public void run() {
		println("Unicycle Run ");
	}
	
}

class Bicycle extends Cycle{
	
	public void run() {
		println("Bicycle Run ");
	}
	
}

class Tricycle extends Cycle{
	
	public void run() {
		println("Tricycle Run ");
	}
	
}
