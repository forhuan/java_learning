package b3;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * 
 * 1.ʲô���̣߳�ʲô�ǽ��̣�
 * 
 * 
 * ����   ����ϵͳ����    �����ڴ��
 * 
 * ����   �������߳�
 * 
 * 
 * 2.��δ���һ���ֳɣ�JAVA�м���ʵ�ַ�ʽ��
 * 
 * 
 * 1.����Thread��
 * 2.ʵ��Runable�ӿ�
 * 3.ʵ��Callable�ӿ�
 * 
 * 
 * 
 * 
 * @author Dandan
 *
 */

public class Test2 {
	public static void main(String[] args) {
//		A a = new A();
//		Thread thread1 = new Thread(a); //�����߳�
//		thread1.start();
//		
//		B b = new B();
//		Thread thread2 = new Thread(b);
//		thread2.start();
//		
		
		new Thread(new Runnable() {
			public void run() {
				for (;;) {
					System.out.println("0");
				}
			}
		}).start();
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new CC());
		
		/**
		 * main ����Ҳ��һ���߳�   ���߳�
		 * 
		 * 
		 * �߳����ȼ� / ʱ���ֻ�
		 * 
		 * 
		 */
//		
//		for(;;){
//			System.out.println("world");
//		}
	}

}


class A extends Thread {
	
	@Override
	public void run() {
		for (;;) {
			System.out.println("hello");
		}
	}
	
	//alt shift s override
}

/**
 * ʵ��Runnable�ӿ�
 * @author Dandan
 *
 */

class B implements Runnable{
	
	@Override
	public void run() {
		for (;;) {
			System.out.println("1");
		}
	}
}

class CC implements Callable{
	@Override
	public Object call() throws Exception {
		for (;;) {
			System.out.println("2");
		}
	}
}