import java.util.Scanner;
// �Ǻ���ġ ���� �˰���
public class FibonacciNumbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		
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