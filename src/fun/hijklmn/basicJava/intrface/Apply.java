package fun.hijklmn.basicJava.intrface;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

import java.util.Arrays;

/**
 * 
 * @Desc:
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Feb 25, 2019-3:32:48 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.intrface
 * @Projectname:basicJava
 * @Filename:Apply.java
 * @Tags:
 */
public class Apply {

	public static void process(Processor p, Object o) {
		println("Using Processor "+p.name());
		println(p.process(o));
	}
	
	public static String s = "Disagreement with beliefs is by definition incorrect !";
	
	public static void main(String[] args) {
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}
	
}

class Processor{
	
	public String name() {
		return getClass().getSimpleName();
	}
	
	Object process(Object input) {
		return input;
	}
	
}

class Upcase extends Processor{

	String process(Object input) {
		return ((String)input).toUpperCase();
	} 
	
}

class Downcase extends Processor{
	
	String process(Object input) {
		return ((String)input).toLowerCase();
	}
	
}

class Splitter extends Processor{
	
	String process(Object input) {
		return Arrays.toString(((String)input).split(" "));
	}
	
}

// Using Processor Upcase
// DISAGREEMENT WITH BELIEFS IS BY DEFINITION INCORRECT !
// Using Processor Downcase
// disagreement with beliefs is by definition incorrect !
// Using Processor Splitter
// [Disagreement, with, beliefs, is, by, definition, incorrect, !]
