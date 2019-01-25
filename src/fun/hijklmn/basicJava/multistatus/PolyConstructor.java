package fun.hijklmn.basicJava.multistatus;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc:don't produce what you might expect 
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 25, 2019-9:47:00 AM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.multistatus
 * @Projectname:basicJava
 * @Filename:PolyConstructor.java
 * @Tags:
 */
public class PolyConstructor {

	public static void main(String[] args) {
		new RoundGlyph(5);
	}
	
}


class Glyph{
	
	void draw() {
		println("Glyph.draw()");
	}
	
	Glyph(){
		println("Glyph() before draw()");
		draw();
		println("Glyph() after draw()");
	}
	
}

class RoundGlyph extends Glyph{
	
	private int radius = 1;
	
	RoundGlyph(int radius){
		this.radius = radius;
		println("RoundGlyph.RoundGlyph() , radius : "+radius);
	}
	
	void draw() {
		println("RoundGlyph.draw() , radius : " + radius);
	}
	
}