package b1;
/*
 * ����JVM����class�ļ���ԭ��ͻ���
 * 
 * 
 * 
 * 
 */


public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		System.out.println(p1);
	}

}


/* ClassLoader 
 * �ļ�У���� / Bootstrap ClassLoade �� Extension ClassLoader ��App ClassLoader -> find / ClassNotFoundException
 * У�����Ƿ���������       ����String List                            ������                                                 
 * 
 * --> (take) JVM < --> (wait be build)  --> (����)Person.class --> (wait be use)
 * 
 * 
 * 
 * .java -- javac --> .class
 */
