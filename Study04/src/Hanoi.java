import java.util.Scanner;
 
public class Hanoi {
	
	// StringBuilder ���� ���ο� ��ü ������ �ƴ϶� ������ �����Ϳ� ���ϴ� ����� ����ؼ� �ӵ��� �� ������
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
 
		sb.append((int) (Math.pow(2, N) - 1)).append('\n'); // ���� �ű� Ƚ��
 
		Hanoi(N, 1, 2, 3);
		System.out.println(sb);
 
	}
 
	/*
		N : ������ ���� 
		start : ����� (ó��)
		mid : �ű�� ���� �̵��ؾ� ���(�߰�) 
		to : ������ (��)
	 */
 
	public static void Hanoi(int N, int start, int mid, int to) {
		// �̵��� ������ ���� 1�����?
		if (N == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		// # 1: N-1���� start���� mid�� �̵�
		Hanoi(N - 1, start, to, mid);
		
		// # 2: 1���� start���� to�� �̵�
		sb.append(start + " " + to + "\n");
		
		// # 3: N-1���� mid���� to�� �̵�
		Hanoi(N - 1, mid, start, to);
 
	}
}