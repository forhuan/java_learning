package b2;

import java.util.ArrayList;
import java.util.Iterator;


/*
 * �Լ���ʵ��ArrayList
 * 
 * �Զ���Iterator
 * 
 * ArrayList �ײ�����
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
		
		System.out.println("���Ե���������");
		Iterator itor = list.iterator();
		
		while(itor.hasNext()){
			System.out.println(itor.next());
		}
		
		System.out.println("���Ա���");
		MyIterator it = ml.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
