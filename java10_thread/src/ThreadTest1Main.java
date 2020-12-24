public class ThreadTest1Main {

	public ThreadTest1Main() {
		
	}
	public static void main(String[] args) {
		//ThreadTest1 t1 = new ThreadTest1("첫번째");
		//t1.numOutput();
		//t1.start();
		
		//ThreadTest1 t2 = new ThreadTest1("두번째");
		//t1.numOutput();
		//t2.start();
		
		ThreadTest2 t3 = new ThreadTest2("first");
		ThreadTest2 t4 = new ThreadTest2("second");
		
		//Thread 객체
		Thread tt3 = new Thread(t3);
		Thread tt4 = new Thread(t4);
		
		tt4.setPriority(Thread.MAX_PRIORITY);// 우선순위
		
		tt3.start();
		tt4.start();
	}
}
