package �ڹٱ���;

public class VariableEx01 {
	static int v2;  //v2�� Ŭ���� ��������� �ڵ����� �ʱ�ȭ�ȴ�.
	
	public static void main(String[] args) {
	   int v1 = 15; // ���� �����̴�. ���������� �ʱ�ȭ�� �ؾ��Ѵ�.
	
	if(v1 > 10) {  //[�ּ�] if ���
		/*
		 * ������ ����� ��� �������� ����� �����ϴ�.
		 * �������� �ּ�ó���Ҷ�
		 */
		
		v2 = v1 - 10;
	}

	int v3 = v1 + v2 +5;
	System.out.println(v3);

	}

}
