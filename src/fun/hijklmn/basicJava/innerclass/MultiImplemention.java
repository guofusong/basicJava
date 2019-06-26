package fun.hijklmn.basicJava.innerclass;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * 
 * @Desc:
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jun 23, 20192:52:51 PM
 * @WhereBuilding:home
 * @Packagename:fun.hijklmn.basicJava.innerclass
 * @Projectname:basicJava
 * @Filename:MultiImplemention.java
 * @Tags:
 */
public class MultiImplemention {
	
	static void takesD(D d) {
		println("takesD()");
	}
	
	static void takesE(E e) {
		println("takesE()");
	}
	
	public static void main(String[] args) {
		
		Z z = new Z();
		
		takesD(z);
		
		takesE(z.makeE());
		
	}
	
}

class D {}

abstract class E {}

class Z extends D {
	
	E makeE() {
		println("makeE()");
		return new E() {}; 
	}
	
}
