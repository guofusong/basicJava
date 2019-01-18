package fun.hijklmn.basicJava.multistatus;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc:super , override field and methods , field can not override but can copy .  
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 18, 2019-10:44:36 AM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.multistatus
 * @Projectname:basicJava
 * @Filename:FieldAccess.java
 * @Tags:
 */
public class FieldAccess {

	public static void main(String[] args) {
		Super sup = new Sub();
		println("field:"+sup.field+";getField:"+sup.getField()+";");
		Sub sub = new Sub();
		println("field:"+sub.field+";getField:"+sub.getField()+";getSuperField:"+sub.getSuperField()+";");
	}
	
}


class Super{
	
	public int field = 0;
	
	public int getField() {
		return field;
	}
	
}

class Sub extends Super{
	
	public int field = 1;
	
	public int getField() {
		return field;
	}
	
	public int getSuperField() {
		return super.field;
	}
	
}