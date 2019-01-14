package fun.hijklmn.basicJava.utils;

import java.util.Collection;

/**
 * 
 * @Desc: this for print content in console . 
 * @WhoBuilding:GuoFusong
 * @WhenBuilding:Jan 14, 2019-5:25:33 PM
 * @WhereBuilding:company
 * @Packagename:fun.hijklmn.basicJava.utils
 * @Projectname:basicJava
 * @Filename:PrintUtils.java
 * @Tags:
 */
public class PrintUtils {

	public static <T> void print(T t) {
		System.out.print(t);
	}
	
	public static <T> void println(T t) {
		System.out.println(t);
	}
	
	public static <T> void walk(T[] t) {
		if(t == null)
			return;
		for(T item : t) {
			println(item);
		}
	}
	
	public static <T> void walk(Collection<T> c) {
		if(c == null)
			return;
		for(T item : c) {
			println(item);
		}
	}
	
}
