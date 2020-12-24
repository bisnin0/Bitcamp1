class BBBB {
	private String addr = "서울시 마포구 백범로";
	//private BBBB() { //객체생성불가
	BBBB() {
		System.out.println("BBBB()생성자 메소드");
	}
	void output() {
		System.out.println("주소="+ addr);
	}
}
