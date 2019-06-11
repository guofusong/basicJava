package fun.hijklmn.basicJava.object;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

class Super{
	public int field = 0;
	public int getField() {
		return this.field;
	}
}

class Sub extends Super{
	public int field = 1;
	public int getField() {
		return this.field;
	}
	public int getSuperField() {
		return super.field;
	}
	
}

/**
 * @Desc:field and static method .
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:May 6, 201910:26:56 PM
 * @WhereBuilding:home
 * @Packagename:fun.hijklmn.basicJava.object
 * @Projectname:basicJava
 * @Filename:FieldAccess.java
 * @Tags:
 */
public class FieldAccess {

	public static void main(String[] args) {
		Super sup = new Sub();
		println("super field : " + sup.field + " , sup.getField() = " + sup.getField());
		
		Sub sub = new Sub();
		println("sub.field = " + sub.field + " , sub.getField() = " + sub.getField() + " , sub.getSuperField() = " + sub.getSuperField());
		
	}
	
}
