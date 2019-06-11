package fun.hijklmn.basicJava.innerclass;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * 
 * @Desc:
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jun 11, 201910:26:16 PM
 * @WhereBuilding:home
 * @Packagename:fun.hijklmn.basicJava.innerclass
 * @Projectname:basicJava
 * @Filename:ClassInInterface.java
 * @Tags:
 */
public interface ClassInInterface {

	void howdy();
	
	// public static
	class Test implements ClassInInterface {

		@Override
		public void howdy() {
			println("howdy!");
		}
		
		public static void main(String[] args) {
			
			new Test().howdy();
			
		}
		
	}
	
}
