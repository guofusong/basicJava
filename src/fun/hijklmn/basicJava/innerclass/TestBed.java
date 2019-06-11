package fun.hijklmn.basicJava.innerclass;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

public class TestBed {

	public void f() {
		println("f()");
	}
	
	public static class Tester {
		public static void main(String[] args) {
			
			TestBed tb = new TestBed();
			
			tb.f();
			
		}
	}
	
}
