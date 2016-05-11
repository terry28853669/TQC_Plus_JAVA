import java.util.Scanner;

public class JA404 {
	public static void main(String args[]) {
		System.out.print("Input m: ");
		Scanner keyboard = new Scanner(System.in);
		for (int i = keyboard.nextInt(); i != 999; i = keyboard.nextInt()) {
			System.out.print("Input n: ");
			int j = keyboard.nextInt();
			System.out.println("最大公因數為：" + gcd(i, j));
			System.out.print("Input m: ");
		}
	}

	static int gcd(int i, int j) {
		if (j == 0)
			return i;
		else
			return gcd(j, i % j);
	}
}
