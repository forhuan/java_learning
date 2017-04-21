package b1;
/*
 * 描述JVM加载class文件的原理和机制
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
 * 文件校验器 / Bootstrap ClassLoade 、 Extension ClassLoader 、App ClassLoader -> find / ClassNotFoundException
 * 校验类是否正常可用       常用String List                            不常用                                                 
 * 
 * --> (take) JVM < --> (wait be build)  --> (引用)Person.class --> (wait be use)
 * 
 * 
 * 
 * .java -- javac --> .class
 */
