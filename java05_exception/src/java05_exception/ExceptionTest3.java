package java05_exception;

public class ExceptionTest3 {

	public ExceptionTest3() {		
		try {
			sum();
			Thread.sleep(2000);// 1000=1s, 2000=2s
			oddSum();	
		}catch(InterruptedException ie) {
			System.out.println("¿¹¿Ü¹ß»ýµÊ....");
		}			
	}
	public void sum() {
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
		System.out.println("sum="+sum);
	}
	public void oddSum() {
		int oddSum=0;
		for(int i=1; i<=100; i+=2) {
			oddSum += i;
		}
		System.out.println("oddSum="+oddSum);
	}
	public static void main(String[] args) {
		new ExceptionTest3();
	}

}
