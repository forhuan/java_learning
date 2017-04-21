package b1;
/*
 * switch 能否作用在byte上，是否能用在long上，是否能作用在String上？
 * long 不支持
 * String jdk1.7之后
 * 枚举类型是jdk1.5支持
 */
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 3;   // byte short char int
		char b = 4;   //long 不可以
		
		switch(b){
		case 1:
			break;
			
		default:
			break;
		}
		
		String str="123";   //java版本1.7以上就好了
		
		switch (str) {
		case "123":
			
			break;

		default:
			break;
		}
		
		
		
		//枚举类型 1.5			
		MyEnum myenum=MyEnum.BCA;
		switch (myenum) {
		case ABC:
			
			break;

		default:
			break;
		}
	}
}


enum MyEnum{
	ABC,
	BCA,
}