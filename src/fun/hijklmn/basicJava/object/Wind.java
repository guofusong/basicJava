package fun.hijklmn.basicJava.object;

class Instrument{
	
	public void play() {
		System.out.println("Instrument play .");
	}
	
	static void tune(Instrument instrument) {
		instrument.play();
	}
	
}

/**
 * 
 * * 描述：向上转型
 * @Author：guosong
 * @DateTime：2019年1月10日 下午10:26:41
 */
public class Wind extends Instrument{
	
	public static void main(String[] args) {
		Wind flute = new Wind();
		Instrument.tune(flute);
	}
	
}
