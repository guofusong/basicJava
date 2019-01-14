package fun.hijklmn.basicJava.object;

/**
 * 
 * @Desc:object up case
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 14, 2019-12:46:44 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.object
 * @Projectname:basicJava
 * @Filename:Amphibian.java
 * @Tags:
 */
public class Amphibian {

	protected void say() {
		System.out.println("say...");
	}

	
	protected void move() {
		System.out.println("move...");
	}
	
	public void process(Amphibian amphibian) {
		if(amphibian != null) {
			amphibian.say();
			amphibian.move();
		}
	}
	
	public static void main(String[] args) {
		Amphibian amphibian = new Frog();
		Amphibian tigerFrog = new TigerFrog();
		amphibian.say();
		amphibian.move();
		amphibian.process(tigerFrog);
	}
	
}

/**
 * 
 * @Desc:override father class default methods
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 14, 2019-2:00:11 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.object
 * @Projectname:basicJava
 * @Filename:Amphibian.java
 * @Tags:
 */
class TigerFrog extends Amphibian{
	
	public void say() {
		System.out.println("say tigerfrog . . . ");
	}
	
	protected void move() {
		System.out.println("move tigerfrog . . . ");
	}
	
}

class Frog extends Amphibian{
	
	public void sayF() {
		System.out.println("sayF . . . ");
	}
	
	public void moveF() {
		System.out.println("moveF . . . ");
	}
	
}
