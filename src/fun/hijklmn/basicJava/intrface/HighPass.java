package fun.hijklmn.basicJava.intrface;

/**
 * 
 * @Desc:
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Mar 13, 2019-3:18:38 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.intrface
 * @Projectname:basicJava
 * @Filename:HighPass.java
 * @Tags:
 */
public class HighPass extends Filter {

	double cutoff;
	
	public HighPass(double cutoff) {
		this.cutoff = cutoff;
	}
	
	public Waveform process(Waveform input) {
		return input;
	}
	
}
