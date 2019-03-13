package fun.hijklmn.basicJava.intrface;

/**
 * 
 * @Desc:
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Mar 13, 2019-3:14:47 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.intrface
 * @Projectname:basicJava
 * @Filename:LowPass.java
 * @Tags:
 */
public class LowPass extends Filter {

	double cutoff;
	
	public LowPass(double cutoff) {
		this.cutoff = cutoff;
	}
	
	public Waveform process(Waveform input) {
		return input;
	}
	
}
