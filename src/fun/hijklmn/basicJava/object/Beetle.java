package fun.hijklmn.basicJava.object;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc:the full process of initialition 
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 15, 2019-5:13:52 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.object
 * @Projectname:basicJava
 * @Filename:Beetle.java
 * @Tags:
 */
public class Beetle extends Insect{

	private int k = printInit("input beetle printlnInit .");
	
	private static int x2 = printInit("input x2 beetle printlnInit .");
	
	public Beetle(){
		println("[k="+k+"]");
		println("[x2="+x2+"]");
	}
	
	public static void main(String[] args) {
		
		// process 1 
		
		//println("Beetle Construct");
		//Beetle beetle = new Beetle();
		
		// process 2
		// println(LadyBug.j);
		
		// process 3
		new LadyBug();
	}
	
}

class Insect{
	
	private static int i = printInit("input insect printlnInit .");
	
	private int l = printInit("input insect l printlnInit");
	
	protected int j;
	
	static int printInit(String s) {
		println(s);
		return 47;
	}
	
	Insect(){
		println("Insect Construct[i="+i+",j="+j+"]");
		j = 23;
	}
	
} 

class LadyBug{
	
	private static int i = printInit("LadyBug Field i . ");
			
	public static int j = printInit("LadyBug Field j . ");
	
	private int k = printInit("LadyBug Field k . ");
	
	static int printInit(String s) {
		println(s);
		return 52;
	}		
	
	public LadyBug(){
		printInit("LadyBug Construct . ");
	} 
	
}


// process 1
// input insect printlnInit .
// input x2 beetle printlnInit .
// Beetle Construct
// input insect l printlnInit
// Insect Construct[i=47,j=0]
// input beetle printlnInit .
// [k=47]
// [x2=47]

// process 2
// input insect printlnInit .
// input x2 beetle printlnInit .
// LadyBug Field i . 
// LadyBug Field j .
// 52

// process 3
// input insect printlnInit .
// input x2 beetle printlnInit .
// LadyBug Field i . 
// LadyBug Field j . 
// LadyBug Field k . 
// LadyBug Construct . 
