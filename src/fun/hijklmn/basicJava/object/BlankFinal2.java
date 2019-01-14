package fun.hijklmn.basicJava.object;

/**
 * 
 * @Desc:reusing BlankFinal.java,the blank final fields , the blank final fields .
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 14, 2019-5:08:57 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.object
 * @Projectname:basicJava
 * @Filename:BlankFinal2.java
 * @Tags:
 */
public class BlankFinal2 {

	private final int i = 0;
	
	private final int j;
	
	private final Poppet1 p;
	
	public BlankFinal2() {
		this.j = 12;
		p = new Poppet1(j);
	}
	
	public BlankFinal2(int value) {
		// Can not set value again.
		// i = 12;
		
		j = value;
		p = new Poppet1(value);
	}
	
	public static void main(String[] args) {
		new BlankFinal2();
		new BlankFinal2(23);
	}
	
}

class Poppet1{
	
	private int i;
	
	Poppet1(int i){
		this.i = i;
	}
	
}