import java.util.Scanner;
// 피보나치 수열 알고리즘
public class FibonacciNumbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		
		int n = sc.nextInt();
		int a = 1;
		int b;
		int c = 0;
		
		for(int i=0; i<n; i++) {
			System.out.println(c);
			b = a;
			a = c;
			c = b + a;
		}
		sc.close();
	}
}