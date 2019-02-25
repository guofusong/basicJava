package fun.hijklmn.basicJava.intrface;

/**
 * 
 * @Desc:
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Feb 25, 2019-3:40:04 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.intrface
 * @Projectname:basicJava
 * @Filename:Waveform.java
 * @Tags:
 */
public class Waveform {

	private static long counter;
	
	private static long id = counter ++;
	
	public String toString() {
		return "Waveform " + id;
	}
	
}
