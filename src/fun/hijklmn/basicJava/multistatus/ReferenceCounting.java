package fun.hijklmn.basicJava.multistatus;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc:reference count . 
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 18, 2019-2:25:55 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.multistatus
 * @Projectname:basicJava
 * @Filename:ReferenceCounting.java
 * @Tags:
 */
public class ReferenceCounting {

	public static void main(String[] args) {
		
		Shared shared = new Shared();
		Composing[] c = new Composing[] {new Composing(shared),new Composing(shared),new Composing(shared),new Composing(shared),new Composing(shared)};
		for(Composing composing : c) 
			composing.dispose();
		
		ReferenceCounting rc = new ReferenceCounting();
		rc.finalize();
		
	}
	
	public void finalize() {
		println("finalize .");
	}
	
}

class Shared{
	
	private int refCount = 0;
	
	private static long counter = 0;
	
	private final long id = counter++;
	
	public Shared(){
		println("Creating " + this);
	}
	
	public void addRef() {
		refCount ++;
	}
	
	protected void dispose() {
		if(--refCount == 0) 
			println("Disposing " + this);
	}
	
	public String toString() {
		return "Shared " + id;
	}
	
}

class Composing{
	
	private Shared shared;
	
	private static long counter = 0;
	
	private final long id = counter++;
	
	public Composing(Shared shared) {
		println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
	
	protected void dispose() {
		println("Disposing " + this);
		shared.dispose();
	}
	
	public String toString() {
		return "Compsing " + id;
	}
	
}

