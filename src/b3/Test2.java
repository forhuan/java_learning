package b3;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * 
 * 1.什么是线程？什么是进程？
 * 
 * 
 * 进程   操作系统层面    基于内存的
 * 
 * 进程   里面是线程
 * 
 * 
 * 2.如何创建一个现成？JAVA有几种实现方式？
 * 
 * 
 * 1.集成Thread类
 * 2.实现Runable接口
 * 3.实现Callable接口
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
//		Thread thread1 = new Thread(a); //创建线程
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
		 * main 方法也是一个线程   主线程
		 * 
		 * 
		 * 线程优先级 / 时间轮换
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
 * 实现Runnable接口
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