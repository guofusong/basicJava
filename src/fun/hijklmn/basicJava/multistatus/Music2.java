package fun.hijklmn.basicJava.multistatus;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc:object up cast
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 16, 2019-11:04:48 AM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.multistatus
 * @Projectname:basicJava
 * @Filename:Music2.java
 * @Tags:
 */
public class Music2 {

	public static void tune(Stringed s) {
		s.play(Note.MIDDLE_C);
	}
	
	public static void tune(Brass b) {
		b.play(Note.MIDDLE_C);
	}
	
	public static void main(String[] args) {
		Stringed s = new Stringed();
		tune(s);
		Brass b = new Brass();
		tune(b);
	}
	
}

class Stringed extends Instrument{
	public void play(Note n) {
		println("Stringed.paly() " +n);
	}
}

class Brass extends Instrument{
	public void play(Note n) {
		println("Brass.paly() " +n);
	}
}
