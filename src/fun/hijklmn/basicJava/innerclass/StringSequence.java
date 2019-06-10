package fun.hijklmn.basicJava.innerclass;

import java.util.UUID;

import fun.hijklmn.basicJava.innerclass.StringSequence.StringEntity;

import static fun.hijklmn.basicJava.utils.PrintUtils.*;

public class StringSequence {

	private StringEntity[] items;
	
	private int next = 0;
	
	public StringSequence(int size) {
		items = new StringEntity[size];
	}
	
	public void add(StringEntity stringEntity) {
		if (next < items.length) {
			items[next++] = stringEntity;
		}
	}
	
	public StringSelector selector() {
		return new StringSequenceSelector();
	}
	
	public static void main(String[] args) {
		
		StringSequence sequence = new StringSequence(10);
		
		for (int i=0; i<10; i++)
			sequence.add(sequence.new StringEntity(Integer.toString(i), UUID.randomUUID().toString()));
		
		StringSelector stringSelector = sequence.selector();
		
		while (!stringSelector.end()) {
			println(stringSelector.current());
			stringSelector.next();
		}
		
	}
	
	class StringSequenceSelector implements StringSelector {

		private int i = 0;
		
		@Override
		public boolean end() {
			return i == items.length;
		}

		@Override
		public StringEntity current() {
			return items[i];
		}

		@Override
		public void next() {
			if (i < items.length) {
				i ++;
			}
		}
		
	}
	
	class StringEntity {
		
		String label;

		String content;
		
		StringEntity(String label, String content) {
			this.label = label;
			this.content = content;
		}

		@Override
		public String toString() {
			return "StringEntity [label=" + label + ", content=" + content + "]";
		}
		
	}
	
}

interface StringSelector {
	
	boolean end();
	
	StringEntity current();
	
	void next();
	
}
