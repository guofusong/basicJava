package fun.hijklmn.basicJava.innerclass;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc 	
 * @author GuoFusong
 * @Datetime 2019年6月10日上午10:53:37
 */
public class Parcel2 {

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
	
	public Destination to(String destination) {
		return new Destination(destination);
	}
	
	public Contents contents() {
		return new Contents();
	}
	
	
	public void ship(String dest) {

		Contents contents = new Contents();
		
		Destination destination = new Destination(dest);
		
		println(destination.readLabel());
		
	}
	
	public static void main(String[] args) {
		
		Parcel2 parcel1 = new Parcel2();
		
		parcel1.ship("chongqing");
		
		Parcel2.Contents contents = parcel1.contents();
		
		println(contents.getValue());
		
		Parcel2.Destination destination = parcel1.to("chengdu");
		
		println(destination.readLabel());
		
		Parcel2.Destination destination2 = parcel1.new Destination("beijing");
		
		println(destination2.readLabel());
		
	}
	
}
