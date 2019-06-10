package fun.hijklmn.basicJava.innerclass;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc 	
 * @author GuoFusong
 * @Datetime 2019年6月10日上午10:30:23
 */
public class Parcel1 {

	class Contents {
		
		private int i;
		
		public int getValue() {
			return i;
		}
		
	}
	
	class Destination {
		
		private String label;
		
		Destination(String label) {
			this.label = label;
		}
		
		String readLabel() {
			return this.label;
		}
		
	}
	
	@SuppressWarnings("unused")
	public void ship(String dest) {

		Contents contents = new Contents();
		
		Destination destination = new Destination(dest);
		
		println(destination.readLabel());
		
	}
	
	public static void main(String[] args) {
		
		Parcel1 parcel1 = new Parcel1();
		
		parcel1.ship("dest......");
		
	}
	
}
