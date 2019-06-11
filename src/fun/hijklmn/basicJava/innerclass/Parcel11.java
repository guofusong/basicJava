package fun.hijklmn.basicJava.innerclass;

/**
 * 
 * 
 * @Desc:
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jun 11, 201910:08:22 PM
 * @WhereBuilding:home
 * @Packagename:fun.hijklmn.basicJava.innerclass
 * @Projectname:basicJava
 * @Filename:Parcel11.java
 * @Tags:
 */
public class Parcel11 {

	private static class ParcelContents implements Contents {
		
		private int i = 11;
		
		public int value() {
			return this.i;
		}
		
	}
	
	protected static class ParcelDestination implements Destination {
		
		private String label;
		
		private ParcelDestination(String label) {
			this.label = label;
		}
		
		public String readLable() {
			return this.label;
		}
		
		public static void f() {}
		
		static int x = 10;
		
		static class AnotherLevel {
			
			public static void f() {}
			
			static int x = 10;
			
		}
		
	}

	public static Destination destination(String whereTo) {
		return new ParcelDestination(whereTo);
	}
	
	public static Contents contents() {
		return new ParcelContents();
	}
	
	public static void main(String[] args) {
		
		Contents contents = contents();
		
		Destination destination = destination("chongqing");
		
	}
	
}

interface Contents {}

interface Destination {}
