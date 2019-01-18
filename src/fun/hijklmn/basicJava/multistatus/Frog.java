package fun.hijklmn.basicJava.multistatus;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc:override and process effect to dispose . 
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 18, 2019-12:41:49 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.multistatus
 * @Projectname:basicJava
 * @Filename:Frog.java
 * @Tags:
 */
public class Frog extends Amphibian{

	private Characteristic c = new Characteristic("Croaks");
	
	private Description d = new Description("Eats Bugs");
	
	public Frog() {
		println("Frog()");
	}
	
	protected void dispose() {
		println("Frog dispose");
		c.dispose();
		d.dispose();
		super.dispose();
	}
	
	public static void main(String[] args) {
		Frog f = new Frog();
		println("Bye");
		f.dispose();
	}
	
}

class Characteristic{
	
	private String s;
	
	Characteristic(String s){
		this.s = s;
		println("creating Characteristic s is : "+s);
	}
	
	protected void dispose() {
		println("dispose Characteristic s is : "+s);
	}
	
}

class Description{
	
	private String s;
	
	Description(String s){
		this.s = s;
		println("creating Description d is : " + s);
	}
	
	protected void dispose() {
		println("dispose Description d is : " + s);
	}
	
}

class LivingCreature{
	
	private Characteristic c = new Characteristic("is alive");
	
	private Description d = new Description("Basic Living Creature");
	
	LivingCreature(){
		println("LivingCreature()");
	}
	
	protected void dispose() {
		println("LivingCreature dispose");
		c.dispose();
		d.dispose();
	}
	
}

class Animal extends LivingCreature{
	
	private Characteristic c = new Characteristic("has heart");
	
	private Description d = new Description("Animal not Vegetable");
	
	Animal(){
		println("Animal()");
	}
	
	protected void dispose() {
		println("Animal dispose");
		c.dispose();
		d.dispose();
		super.dispose();
	}
	
}

class Amphibian extends Animal{
	
	private Characteristic c = new Characteristic("can live in water");
	
	private Description d = new Description("Both water and land");
	
	Amphibian(){
		println("Amphibian()");
	}
	
	protected void dispose() {
		println("Amphibian dispose");
		c.dispose();
		d.dispose();
		super.dispose();
	}
	
} 

// outer line

//creating Characteristic s is : is alive
//creating Description d is : Basic Living Creature
//LivingCreature()
//creating Characteristic s is : has heart
//creating Description d is : Animal not Vegetable
//Animal()
//creating Characteristic s is : can live in water
//creating Description d is : Both water and land
//Amphibian()
//creating Characteristic s is : Croaks
//creating Description d is : Eats Bugs
//Frog()
//Bye
//Frog dispose
//dispose Characteristic s is : Croaks
//dispose Description d is : Eats Bugs
//Amphibian dispose
//dispose Characteristic s is : can live in water
//dispose Description d is : Both water and land
//Animal dispose
//dispose Characteristic s is : has heart
//dispose Description d is : Animal not Vegetable
//LivingCreature dispose
//dispose Characteristic s is : is alive
//dispose Description d is : Basic Living Creature
