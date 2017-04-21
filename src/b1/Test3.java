package b1;

/*
 * 
 * 封装：类 / 封装属性和行为副类中
 *     方法（函数）：具体实现过程的封装
 * 
 * 
 * 继承：新写的类继承之前已经有的属性和方法
 *    之前有写好的     新写的类叫子类（派生类）  原来的叫父类（基类）
 * 	  
 * 构造函数名和类名相同  --> 子类名和父类名不同 --> 子类不继承父类的构造函数
 * 
 * 构造函数（方法）可以被重写（Override）? 不能
 * 
 * 父类的方法可以被重写
 * 
 * 多态： 父类的指针指向子类的对象   / 父类 创建不同的对象，对于同一方法可以有不同的相应
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
		System.out.println("暴力推开");
	}
	 
}



class Woman extends Person {
	
	@Override
	void openDoor() {
		System.out.println("轻轻推开");
	}
}

