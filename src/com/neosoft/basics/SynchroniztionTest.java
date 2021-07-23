package com.neosoft.basics;

public class SynchroniztionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread() {
			@Override
			public void run() {
				Printer.doPrint("Java");
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				Printer.doPrint("Python");
			}
		}.start();
	}

}

class Printer{
//	synchronized void doPrint(String doc) {
//		for(int i=1;i<=10;i++) {
//			System.out.println("Printing Doc : "+doc+" : "+i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				System.out.println(e.getMessage());
//			}
//		}
//	}
	
//	void doPrint(String doc) {
//		synchronized (this) {
//			for(int i=1;i<=10;i++) {
//				System.out.println("Printing Doc : "+doc+" : "+i);
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					System.out.println(e.getMessage());
//				}
//			}
//		}
//	}
	
	synchronized static void doPrint(String doc) {
		for(int i=1;i<=10;i++) {
			System.out.println("Printing Doc : "+doc+" : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
	}
}
class PC1 extends Thread{
	Printer p;
	public PC1(Printer p) {
		this.p=p;
	}
	
	@Override
	public void run() {
		p.doPrint("Java");
	}
}

class PC2 extends Thread{
	Printer p;
	public PC2(Printer p) {
		this.p=p;
	}
	
	@Override
	public void run() {
		p.doPrint("Python");
	}
}
