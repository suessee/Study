import java.util.Scanner;
public class Factorial {
	
	public static void main(String[] args) {
		int a; 
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt(); // a에 숫자 입력 하기
		System.out.println(fact(a)); // fact함수에 a값 넣은 결과 출력
	}
	
	public static int fact(int a) {
		if (a <= 1 || a == 0) // 입력받는 수 a가 1보다 작거나 0일 때 1출력
			return 1;
		else
			return fact(a-1) * a; 
//		예를 들어 a가 3일때, a는 1과 0보다 크니 else로 들어와 fact(3)이 실행된다.
//		그 다음 fact(a)가 1또는 0이 될떄 까지 실행되서 결과 값이 반환된다.
	}


}
