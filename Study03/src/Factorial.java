import java.util.Scanner;
public class Factorial {
	
	public static void main(String[] args) {
		int a; 
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt(); // a�� ���� �Է� �ϱ�
		System.out.println(fact(a)); // fact�Լ��� a�� ���� ��� ���
	}
	
	public static int fact(int a) {
		if (a <= 1 || a == 0) // �Է¹޴� �� a�� 1���� �۰ų� 0�� �� 1���.
			return 1;
		else
			return fact(a-1) * a; 
//		���� ��� a�� 3�϶�, a�� 1�� 0���� ũ�� else�� ���� fact(3)�� ����ȴ�.
//		�� ���� fact(a)�� 1�Ǵ� 0�� �ɋ� ���� ����Ǽ� ��� ���� ��ȯ�ȴ�.
	}


}
