import java.util.Scanner;
 
public class Hanoi {
	
	// StringBuilder 사용시 새로운 객체 생성이 아니라 기존의 데이터에 더하는 방식을 사용해서 속도가 더 빨라짐
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
 
		sb.append((int) (Math.pow(2, N) - 1)).append('\n'); // 줄을 옮긴 횟수
 
		Hanoi(N, 1, 2, 3);
		System.out.println(sb);
 
	}
 
	/*
		N : 원판의 개수 
		start : 출발지 (처음)
		mid : 옮기기 위해 이동해야 장소(중간) 
		to : 목적지 (끝)
	 */
 
	public static void Hanoi(int N, int start, int mid, int to) {
		// 이동할 원반의 수가 1개라면?
		if (N == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		// # 1: N-1개를 start에서 mid로 이동
		Hanoi(N - 1, start, to, mid);
		
		// # 2: 1개를 start에서 to로 이동
		sb.append(start + " " + to + "\n");
		
		// # 3: N-1개를 mid에서 to로 이동
		Hanoi(N - 1, mid, start, to);
 
	}
}