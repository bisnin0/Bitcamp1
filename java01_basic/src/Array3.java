class Array3
{
	public static void main(String[] args) 
	{
		System.out.println(args);
		//arguments - 아규멘트, 매개변수, 파라미터
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		//System.out.println(args[2]);

		// id:admin,  password:1234
		//  args[0].equals("admin") && args[1].equals("1234")
		if( "admin".equals(args[0]) && "1234".equals(args[1]) ){
			int sum = 0;
			for(int i=1; i<=100; i++){
				sum += i;
			}
			System.out.println("1~100까지의 합은 "+ sum);
		}else{//로그인 실패시
			System.out.println("아이디와 비밀번호를 잘못입력하였습니다...");
		}		
	}
}
