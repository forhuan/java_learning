package b2;

import java.util.ArrayList;
import java.util.Iterator;


/*
 * 自己来实现ArrayList
 * 
 * 自定义Iterator
 * 
 * ArrayList 底层数组
 * 
 */

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		
		list.add("123");
		list.add("456");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	
		
		MyArrayList ml = new MyArrayList();
		ml.add("123");
		
		System.out.println(ml.get(1));
		
		System.out.println("测试迭代器遍历");
		Iterator itor = list.iterator();
		
		while(itor.hasNext()){
			System.out.println(itor.next());
		}
		
		System.out.println("测试遍历");
		MyIterator it = ml.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
