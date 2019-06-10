package fun.hijklmn.basicJava.innerclass;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

/**
 * 
 * @Desc 	
 * @author GuoFusong
 * @Datetime 2019年6月10日上午11:09:41
 */
public class Sequence {

	private Object[] items;
	
	private int next = 0;
	
	public Sequence(int size) {
		items = new Object[size];
	}
	
	public void add(Object obj) {
		if (next < items.length) {
			items[next++] = obj;
		}
	}
	
	private class SequenceSelector implements Selector {

		private int i = 0;
		
		@Override
		public boolean end() {
			return i == items.length;
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if (i < items.length) {
				i++;
			}
		}
		
	}
	
	public Selector selector() {
		return new SequenceSelector();
	}
	
	public static void main(String[] args) {
		
		Sequence sequence = new Sequence(10);
		
		for (int i=0; i<10; i++)
			sequence.add(Integer.toString(i));
		
		Selector selector = sequence.selector();
		
		while (!selector.end()) {
			println(selector.current());
			selector.next();
		}
	}
	
}

interface Selector {
	
	boolean end();
	
	Object current();
	
	void next();
	
}
