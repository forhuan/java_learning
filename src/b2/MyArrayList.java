package b2;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList {
	private Object[] objs = new Object[10];
	private int index = 0;

	
	public void add(Object o){
		if(index == objs.length){
			//À©ÈÝ
			entend();
		}
		objs[index++] = o;
	}
	
	
	/**
	 * 
	 * @param index
	 * @return
	 */
	public Object get(int index){
		return objs[index]; 
	}
	
	/**
	 * 
	 * @return
	 */
	public int size(){
		return index;
	}
	
	/*
	 * À©ÈÝ 
	 */
	private void entend(){
		Arrays.copyOf(objs, objs.length+1);
	}
	
	public MyIterator iterator(){
		return new iterator();
	}
	
	class iterator implements MyIterator{
		private int size = 0;
		
		@Override
		public boolean hasNext() {
			if(objs[size]!=null) return true;
			else return false;
		}

		@Override
		public Object next() {
			size++;
			return objs[size-1];
		}
		
	}
	
	
}
