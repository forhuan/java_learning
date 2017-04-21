package b1;

public class Test2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Sub();
		//虽然第一步进的是sub ，但是因为sub继承的是Base，所以优先进入Base
		
		/*理解
		 * 
		 * 子类继承父类，New子类的时候，先进的是父类
		 * 在父类中，先进性变量的初始化操作
		 * this 表示的是谁 ？  New的是谁就是谁?
		 * 
		 * 父类的东西走完了之后在走子类的东西
		 * 先变量初始化
		 * 
		 */
		
		System.out.println(b.x); //20
	}
}

class Base {
	
	int x = 10; //3
	
	public Base() {//2
		this.printMessage();//4   this是什么 --> Sub 从子类来的this就是子类的
		x = 20;    //6
	}
	
	public void printMessage(){
		System.out.println("Base.x = " + x);
	}

}

class Sub extends Base {
	int x = 30;//7
	
	public Sub(){//1 不进去
		this.printMessage();//8 
		x = 40;
	}
	
	public void printMessage(){
		System.out.println("Sub.x = " + x); //5 Sub.x = 0   //9 Sub.x = 30
	}
}