package b1;



public class Test1 {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helloworld");
		float f1=(float)3.14;  //����ת�� downcasting upcasting
		float f2=3.14f;        
		float f3=3.14F;
		
		
		//s1 = s1 + 1 �Ǵ���� 
		short s1 = 1;
		s1 = (short)(s1 + 1);
		
		s1 += 1; //Ч�ʸ� ������ �Զ�ǿ������ת��
		
		
		// int �� Interger ������
		// Interger�� int�İ�װ��   int��һ�����ͣ�Interger��һ����װ��
		
		/*
		 * �˴��������ͣ�byte��short��int��long��double��float��blooean��char
		 *   
		 * Integet Ĭ��ֵ��none intĬ��ֵ��0 
		 * 
		 * 
		 */
		Integer a=10;
		int b=10;
		
		//a���Զ������int���� 
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
