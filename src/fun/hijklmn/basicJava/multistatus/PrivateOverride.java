package fun.hijklmn.basicJava.multistatus;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc:override private methods .
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 18, 2019-10:38:14 AM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.multistatus
 * @Projectname:basicJava
 * @Filename:PrivateOverride.java
 * @Tags:
 */
public class PrivateOverride {

	private void f() {
		println("private f()");
	}
	
	public static void main(String[] args) {
		PrivateOverride po = new Derived();
		po.f();
	}
	
}

class Derived extends PrivateOverride{
	
	public void f() {
		println("public f()");
	}
	
}
