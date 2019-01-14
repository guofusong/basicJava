package fun.hijklmn.basicJava.object;

import java.util.Random;

/**
 * 
 * @Desc:use final on object
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 14, 2019-3:35:03 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.object
 * @Projectname:basicJava
 * @Filename:FinalObject.java
 * @Tags:
 */
public final class FinalObject {

	public static final FinalObject finalObject = new FinalObject(14);
	
	private int value;
	
	public FinalObject() {
	}
	
	public FinalObject(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		
		FinalObject finalObject = new FinalObject();
		
		// Can not point to new object 
		// FinalObject.finalObject = finalObject;
		
		System.out.println(finalObject.finalObject.value);
		
		finalObject.finalObject.value = 17;
		
		System.out.println(finalObject.finalObject.value);
		
		finalObject.setValue(12);
		
		System.out.println(finalObject.getValue());
		
		finalObject.setValue(15);
		
		System.out.println(finalObject.getValue());
		
		System.out.println(new FinalObject().finalObject.value);
		
		System.out.println(new FinalObject().finalObject.value);
		
	}
	
}
