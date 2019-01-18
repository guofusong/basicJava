package fun.hijklmn.basicJava.multistatus;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc:polymorphism with static
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 18, 2019-11:02:24 AM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.multistatus
 * @Projectname:basicJava
 * @Filename:StaticPolymorphism.java
 * @Tags:
 */
public class StaticPolymorphism {

	public static void main(String[] args) {
		StaticSuper ss = new StaticSub();
		ss.staticGet();
		ss.dynamicGet();
		StaticSub ss1 = new StaticSub();
		ss1.staticGet();
		ss1.dynamicGet();
	}
	
}

class StaticSuper{
	
	public static void staticGet() {
		println("Super Static Get");
	}
	
	public void dynamicGet(){
		println("Super Dynamic Get");
	}
	
}

class StaticSub extends StaticSuper{
	
	public static void staticGet() {
		println("Sub Static Get");
	}
	
	public void dynamicGet(){
		println("Sub Dynamic Get");
	}
	
}

