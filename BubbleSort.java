import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);		
		int[] A = new int[sc.nextInt()]; // 배열 크기 입력
		
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < A.length; i++) { 
			for(int j = 0; j < A.length-1; j++) { 
				if(A[j] > A[j+1]) {
					swap(A, j, j + 1);
					count += 1;
				}
			}
		}
		for(int i = 0; i < A.length; i++) { 
			System.out.print(A[i]+ " ");
		}
		System.out.println();
		System.out.println(count);
	}
	private static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

}
