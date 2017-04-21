package b2;

import java.io.File;
import java.io.IOException;

/*
 * Out Of Memory
 * 
 * Error和Exception的区别
 * 
 * Exception ： RuntimeException / CheckedExeception
 *                                 必须解决才能编译过
 * NullPointerException、IndexOutBoundsException
 * 
 * ClassCaseException
 * AritheticException
 * IllegalArgumentException
 * ArrayStoreException
 * 
 */


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("aaa");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		String str = null;
		if(str.equals("111")){
			System.out.println("123123");
		}
		
	}

}
