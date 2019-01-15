package fun.hijklmn.basicJava.object;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc:private & final
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 15, 2019-11:50:09 AM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.object
 * @Projectname:basicJava
 * @Filename:FinalOverridingIllusion.java
 * @Tags:
 */
public class FinalOverridingIllusion {

	public static void main(String[] args) {
		
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		
		OverridingPrivate op = op2;
		// Can not call the methods
		// op.g();
		// op.f();
		
		WithFinals wf = op2;
		// Can not call the methods
		// wf.f();
		// wf.g();
		
	}
	
}

class WithFinals{
	
	private final void f() {
		println("WithFinals.f()");
	}
	
	private void g() {
		println("WithFinals.g()");
	}
	
}

class OverridingPrivate extends WithFinals{
	
	private final void f() {
		println("OverridingPrivate.f()");
	}
	
	private void g() {
		println("OverridingPrivate.g()");
	}
	
}

class OverridingPrivate2 extends OverridingPrivate{
	
	public final void f() {
		println("OverridingPrivate2.f()");
	}
	
	public void g() {
		println("OverridingPrivate2.g()");
	}
	
}


