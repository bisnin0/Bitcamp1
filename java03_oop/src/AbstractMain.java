public class AbstractMain extends AbstractTest{
	public AbstractMain() {
		
	}
	public void print(int a) {
		max = a;
		System.out.println("a="+a+", max="+max);
	}
	public int sum() {
		int total=0;
		for(int i=1; i<=max; i++) {
			total+=i;
		}
		return total;
	}
	public static void main(String[] args) {
		//추상클래스는 객체를 생성할수 없다.
		//new AbstractTest();
		//추상클래스는 상속을 받아 모든 추상메소드를 오버라이딩을하여야 한다.
		AbstractMain main = new AbstractMain();
		main.print(200);
		System.out.println("sum="+main.sum());
	}
}
