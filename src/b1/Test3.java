package b1;

/*
 * 
 * ��װ���� / ��װ���Ժ���Ϊ������
 *     ������������������ʵ�ֹ��̵ķ�װ
 * 
 * 
 * �̳У���д����̳�֮ǰ�Ѿ��е����Ժͷ���
 *    ֮ǰ��д�õ�     ��д��������ࣨ�����ࣩ  ԭ���Ľи��ࣨ���ࣩ
 * 	  
 * ���캯������������ͬ  --> �������͸�������ͬ --> ���಻�̳и���Ĺ��캯��
 * 
 * ���캯�������������Ա���д��Override��? ����
 * 
 * ����ķ������Ա���д
 * 
 * ��̬�� �����ָ��ָ������Ķ���   / ���� ������ͬ�Ķ��󣬶���ͬһ���������в�ͬ����Ӧ
 * 
 * 
 * 
 * @author DANDAN
 */




public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTool mt = new MyTool();
		mt.test();
		MyTool.test();
		
		Person p1 = new Man();
		Person p2 = new Woman();
		
		p1.openDoor();
		p2.openDoor();
		
	}

}

class MyTool
{
	public static void test(){
		System.out.println("hello world!");
	}
}



class Person {
	String name;
	
	void openDoor(){
		//...
	}
	
	void openDoor(int a){
		System.out.println("openDoor" + a);
	}
	
	void push(){
		//...
	}
	
	void closeDoor(){
		// ...
	}
}

class Man extends Person {
	
	@Override
	void openDoor() {
		System.out.println("�����ƿ�");
	}
	 
}



class Woman extends Person {
	
	@Override
	void openDoor() {
		System.out.println("�����ƿ�");
	}
}

