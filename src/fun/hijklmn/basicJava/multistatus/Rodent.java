package fun.hijklmn.basicJava.multistatus;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc:object up cast
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 16, 2019-6:17:32 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.multistatus
 * @Projectname:basicJava
 * @Filename:Rodent.java
 * @Tags:
 */
public class Rodent {

	public String name = "";

	public void move() {
		println("Rodent move()");
	}
	
	public void eat() {
		println("Rodent eat()");
	}
	
	public void info() {
		eat();
		move();
	}
	
	public Rodent(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		Rodent[] r = new Rodent[4];
		r[0] = new Rodent("rodent");
		r[1] = new Mouse("mouse");
		r[2] = new Gerbil("gerbil");
		r[3] = new Hamster("hamster");
		
		for(Rodent rodent : r) {
			rodent.info();
			if(rodent instanceof Gerbil) {
				((Gerbil) rodent).say();
			}
		}
		
	}
	
}

class Mouse extends Rodent{

	public Mouse(String name) {
		super(name);
		this.name = name;
	}
	
	public void move() {
		println("Mouse move()");
	}
	
	public void eat() {
		println("Mouse eat()");
	}
	
}

class Gerbil extends Rodent{

	public Gerbil(String name) {
		super(name);
		this.name = name;
	}
	
	public void move() {
		println("Gerbil move()");
	}
	
	public void eat() {
		println("Gerbil eat()");
	}
	
	public void say() {
		println("I am a Gerbil and i info is :");
		info();
	}
	
}

class Hamster extends Rodent{

	public Hamster(String name) {
		super(name);
		this.name = name;
	}
	
	public void move() {
		println("Hamster move()");
	}
	
	public void eat() {
		println("Hamster eat()");
	}
	
}
