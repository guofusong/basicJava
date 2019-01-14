package fun.hijklmn.basicJava.object;

/**
 * 
 * @Desc:the fianl arguments 
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 14, 2019-5:18:57 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.object
 * @Projectname:basicJava
 * @Filename:FinalArguments.java
 * @Tags:
 */
public class FinalArguments {

	private int i;
	
	public FinalArguments(final int i) {
		
		// Can not change value again . 
		// i = 20;
		
		this.i = i;
	}
	
	public int getI() {
		return this.i;
	}
	
	public static void main(String[] args) {
		FinalArguments finalArguments = new FinalArguments(12);
		System.out.println(finalArguments.i);
	}
	
}
