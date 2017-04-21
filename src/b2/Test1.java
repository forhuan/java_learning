package b2;
/*
 * 静态块优先级
 * 
 * 静态块只加载一次
 * 
 * 
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1
		 * a
		 * 2
		 * b
		 * 
		 * 2
		 * b
		 * 
		 */
		
		A a = new B();
		a = new B();
	}

}


class A {
	static {
		System.out.println("1");
	}
	
	public A() {
		System.out.println("2");
	}
}

class B extends A{
	static {
		System.out.println("a");
	}
	
	public B() {
		System.out.println("b");
	}
}

