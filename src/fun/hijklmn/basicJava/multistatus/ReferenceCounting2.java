package fun.hijklmn.basicJava.multistatus;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc:field reference 
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 18, 2019-2:55:43 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.multistatus
 * @Projectname:basicJava
 * @Filename:ReferenceCounting2.java
 * @Tags:
 */
public class ReferenceCounting2 {
	
	private Sharing sharing = new Sharing(); 
	
	private Reference[] referenceArr = new Reference[10];
	
	public ReferenceCounting2() {
		println("Create ReferenceCounting2");
	}
	
	protected void dispose() {
		
		println("ReferenceCounting2 dispose");
		
		sharing.dispose();
		
		for(Reference ref : referenceArr)
			ref.dispose();
		
	}

	public static void main(String[] args) {
		
		ReferenceCounting2 rc2 = new ReferenceCounting2();
		
		for(int i=0; i<10; i++)
			rc2.referenceArr[i] = new Reference();
		
		rc2.dispose();
		
	}
	
}

class Sharing{
	
	private static int refCount = 0;
	
	private static long counter = 0;
	
	private final long id = counter++;
	
	public Sharing() {
		println("creating " + this);
	}
	
	public void addRef() {
		refCount ++;
	}
	
	protected void dispose() {
		if(--refCount == 0)
			println("dispose " + this);
	}
	
	public String toString() {
		return "Sharing " + id;
	}
	
}

class Reference{
	
	private static long counter = 0;
	
	private final long id = counter++;
	
	private Sharing sharing = new Sharing();
	
	public Reference() {
		println("creating " + this + " and " + sharing);
	}
	
	public void addCrt() {
		counter ++;
	}
	
	protected void dispose() {
		println("dispose " + this);
		sharing.dispose();
	}

	public String toString() {
		return "Reference " + id;
	}
	
}
