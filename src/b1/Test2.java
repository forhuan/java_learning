package b1;

public class Test2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Sub();
		//��Ȼ��һ��������sub ��������Ϊsub�̳е���Base���������Ƚ���Base
		
		/*���
		 * 
		 * ����̳и��࣬New�����ʱ���Ƚ����Ǹ���
		 * �ڸ����У��Ƚ��Ա����ĳ�ʼ������
		 * this ��ʾ����˭ ��  New����˭����˭?
		 * 
		 * ����Ķ���������֮����������Ķ���
		 * �ȱ�����ʼ��
		 * 
		 */
		
		System.out.println(b.x); //20
	}
}

class Base {
	
	int x = 10; //3
	
	public Base() {//2
		this.printMessage();//4   this��ʲô --> Sub ����������this���������
		x = 20;    //6
	}
	
	public void printMessage(){
		System.out.println("Base.x = " + x);
	}

}

class Sub extends Base {
	int x = 30;//7
	
	public Sub(){//1 ����ȥ
		this.printMessage();//8 
		x = 40;
	}
	
	public void printMessage(){
		System.out.println("Sub.x = " + x); //5 Sub.x = 0   //9 Sub.x = 30
	}
}