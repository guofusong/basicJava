package fun.hijklmn.basicJava.multistatus;

/**
 * 
 * @Desc:
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 16, 2019-1:58:57 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.multistatus
 * @Projectname:basicJava
 * @Filename:Shapes.java
 * @Tags:
 */
public class Shapes {

	private static RandomShapeGenerater gen = new RandomShapeGenerater();
	
	public static void main(String[] args) {
		
		Shape[] s = new Shape[9];
		for(int i=0; i<s.length; i++) 
			s[i] = gen.next();
		
		for(Shape shape : s) {
			shape.draw();
			shape.notice();
		} 
		
	}
	
}
