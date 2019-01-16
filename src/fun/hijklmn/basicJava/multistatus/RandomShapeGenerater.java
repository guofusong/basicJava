package fun.hijklmn.basicJava.multistatus;

import java.util.Random;

/**
 * 
 * @Desc:shape factory
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 16, 2019-1:55:56 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.multistatus
 * @Projectname:basicJava
 * @Filename:RandomShapeGenerater.java
 * @Tags:
 */
public class RandomShapeGenerater {

	private Random random = new Random(47);
	
	public Shape next() {
		switch(random.nextInt(3)) {
			default:;
			case 0:
					return new Circle();
			case 1:
					return new Square();
			case 2:
					return new Triangle();
		}
	}
	
}
