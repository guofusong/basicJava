package fun.hijklmn.basicJava.multistatus;

/**
 * 
 * @Desc:object up cast
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 16, 2019-10:23:28 AM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.multistatus
 * @Projectname:basicJava
 * @Filename:Music.java
 * @Tags:
 */
public class Music {

	public static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	} 
	
	public static void main(String[] args) {
		Wind wind = new Wind();
		Music.tune(wind);
	}
	
}