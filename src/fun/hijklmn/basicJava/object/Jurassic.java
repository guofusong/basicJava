package fun.hijklmn.basicJava.object;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc:final class
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 15, 2019-2:16:34 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.object
 * @Projectname:basicJava
 * @Filename:Jurassic.java
 * @Tags:
 */
public class Jurassic {

	public static void main(String[] args) {
		Dinosaur d = new Dinosaur();
		println(d.x);
		d.y = 1;
		println(d.y);
		println(d.s);
		d.s = new SmallBrain();
		println(d.s);
	}
	
}

class SmallBrain{}

final class Dinosaur{
	
	int x = 0;
	int y = 0;
	SmallBrain s = new SmallBrain();
	
}

// The type Further cannot subclass the final class Dinosaur
// class Further extends Dinosaur{}

