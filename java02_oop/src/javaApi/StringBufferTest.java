package javaApi;

public class StringBufferTest {
	public StringBufferTest() {
		//���ڿ��� ó��, �����ͼ����Ǿ �ּҸ� �ű��� �ʴ´�.
		//StringBufferŬ����
		//StringBuilderŬ���� 
		
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(50);
		StringBuffer sb3 = new StringBuffer("�ڹ�");
		
		sb.append("StringBuffer");//���ڿ� �߰�
		sb.append("��ü �׽�Ʈ ���Դϴ�.");
		//���ڿ� ���̱��ϱ�
		System.out.println("length="+ sb.length());
		
		//���ڿ� ���� : index��ġ�� ���ڿ� ����
		sb.insert(8, "�������̽�");		
		System.out.println("sb="+ sb);
		// 012345678 90
		// StringBu�������̽�ffer��ü �׽�Ʈ ���Դϴ�.
		sb.delete(3, 7);
		System.out.println("sb="+ sb);
		
		sb.reverse();//���ڿ� �յڹٲٱ�
		System.out.println("sb.reverse()->"+ sb);
		//�޸�ũ��
		System.out.println("capacity="+sb.capacity()+","+sb2.capacity()+","+sb3.capacity());
		
		String str = "test replace";
		StringBuffer st4= new StringBuffer("test replace");
		
		//String�� �����Ͱ� ����Ǹ� �ٽ� �������־�� �Ѵ�.
		str = str.replaceAll("test", "�׽�Ʈ");
		st4.replace(0, 4, "�׽�Ʈ");
		
		System.out.println("str="+str);
		System.out.println("st4="+st4);
	}

	public static void main(StringTokenizerTest[] args) {		
		new StringBufferTest();
	}
}
