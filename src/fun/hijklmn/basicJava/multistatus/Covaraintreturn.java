package fun.hijklmn.basicJava.multistatus;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

public class Covaraintreturn {

	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();
		println(g);
		m = new WheatMill();
		g = m.process();
		println(g);
	}
	
}


class Grain{
	public String toString() {
		return "Grain";
	}
}

class Wheat extends Grain{
	public String toString() {
		return "Wheat";
	}
}

class Mill {
	public Grain process() {
		return new Grain();
	}
}

class WheatMill extends Mill{
	public Wheat process() {
		return new Wheat();
	}
}