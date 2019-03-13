package fun.hijklmn.basicJava.intrface;

/**
 * 
 * @Desc:
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Mar 13, 2019-4:02:11 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.intrface
 * @Projectname:basicJava
 * @Filename:BandPass.java
 * @Tags:
 */
public class BandPass extends Filter {

	double lowCutOff , highCutOff;
	
	public BandPass (double lowCutOff , double highCutOff) {
		this.lowCutOff = lowCutOff;
		this.highCutOff = highCutOff;
	}
	
	public Waveform process(Waveform input) {
		return input;
	}
	
}
