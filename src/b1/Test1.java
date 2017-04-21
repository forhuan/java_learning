package b1;



public class Test1 {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helloworld");
		float f1=(float)3.14;  //向下转型 downcasting upcasting
		float f2=3.14f;        
		float f3=3.14F;
		
		
		//s1 = s1 + 1 是错误的 
		short s1 = 1;
		s1 = (short)(s1 + 1);
		
		s1 += 1; //效率高 ，可以 自动强制类型转换
		
		
		// int 和 Interger 的区别
		// Interger是 int的包装类   int是一个类型，Interger是一个包装类
		
		/*
		 * 八大数据类型：byte、short、int、long、double、float、blooean、char
		 *   
		 * Integet 默认值是none int默认值是0 
		 * 
		 * 
		 */
		Integer a=10;
		int b=10;
		
		//a会自动拆箱成int类型 
		System.out.println(a == b);
		
		
		//4.
		String str = "are you ready";
		changeStr(str);
		System.out.println(str);
		
		str = changeStrr(str);
		System.out.println(str);
		
	}
	
	public static void changeStr(String str){
		str = "hi";
	}
	
	public static String changeStrr(String str){
		return str = "hi";
	}
	
	
}
