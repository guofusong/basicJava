package fun.hijklmn.basicJava.object;

/**
 * 
 * @Desc:the blank final fields . 
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 14, 2019-5:08:57 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.object
 * @Projectname:basicJava
 * @Filename:BlankFinal.java
 * @Tags:
 */
public class BlankFinal {

	private final int i = 0;
	
	private final int j;
	
	private final Poppet p;
	
	public BlankFinal() {
		this.j = 12;
		p = new Poppet(j);
	}
	
	public BlankFinal(int value) {
		j = value;
		p = new Poppet(value);
	}
	
	public static void main(String[] args) {
		new BlankFinal();
		new BlankFinal(23);
	}
	
}

class Poppet{
	
	private int i;
	
	Poppet(int i){
		this.i = i;
	}
	
}