package b1;
/*
 * switch �ܷ�������byte�ϣ��Ƿ�������long�ϣ��Ƿ���������String�ϣ�
 * long ��֧��
 * String jdk1.7֮��
 * ö��������jdk1.5֧��
 */
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 3;   // byte short char int
		char b = 4;   //long ������
		
		switch(b){
		case 1:
			break;
			
		default:
			break;
		}
		
		String str="123";   //java�汾1.7���Ͼͺ���
		
		switch (str) {
		case "123":
			
			break;

		default:
			break;
		}
		
		
		
		//ö������ 1.5			
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