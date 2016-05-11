import java.util.Scanner;

public class JA402 {
	public static void main(String args[]) {
		System.out.print("Input n (0 <= n <= 16): ");
		Scanner keyboard = new Scanner(System.in);
		for (int i = keyboard.nextInt(); i != 999; i = keyboard.nextInt()) {
			System.out.printf("%d ªº¶¥­¼(§ÀºÝ»¼°j) = %d\n",i,facTail(i, 1));
			System.out.printf("%d ªº¶¥­¼(°j°é) = %d\n",i,facLoop(i, 1));
			System.out.print("Input n (0 <= n <= 16): ");
		}
	}
	static int facTail(int i, int j) {
		if (i == 0)
			return j;
		else
			return facTail(i - 1, j * i);
	}
	static int facLoop(int i, int j) {
		int k=i;
		for (; i != 0; i--)
			j =j * i;
		return j;
	}
}
