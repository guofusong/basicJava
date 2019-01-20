package fun.hijklmn.basicJava.multistatus;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc:type
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 16, 2019-10:58:20 AM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.multistatus
 * @Projectname:basicJava
 * @Filename:Note.java
 * @Tags:
 */
public enum Note {
	MIDDLE_C , C_SHARP , B_FLAT;
}

class Instrument{
	public void play(Note n) {
		println("Instrument.play()");
	}
}
