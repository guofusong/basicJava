package fun.hijklmn.basicJava.object;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc:the fianl arguments 
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 14, 2019-5:18:57 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.object
 * @Projectname:basicJava
 * @Filename:FinalArguments2.java
 * @Tags:
 */
public class FinalArguments2 {

	public FinalArguments2() {}
	
	public void within(final Gizmo gizmo) {
		
		// Can not change point 
		// gizmo = new Gizmo();
	}
	
	public void without(Gizmo gizmo) {
		gizmo = new Gizmo();
	}
	
	public int g(int i) {
		println(i);
		return i + 1;
	}
	
	public static void main(String[] args) {
		println("main .");
		FinalArguments2 finalArguments2 = new FinalArguments2();
		finalArguments2.within(null);
		finalArguments2.without(null);
		finalArguments2.g(13);
	}

}

class Gizmo{

	public void spin() {}
	
} 
