import java.util.Scanner;

public class JA308 {
	public static void main(String args[]) {
		int j = 0;
		int k = 0;
		do {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("請輸入消費金額，或輸入-1結束：");
			k = keyboard.nextInt();
			if (k == -1)
				break;
			j = j + k;
		} while (k != -1);
		System.out.println("電腦週邊總消費：" + j);
	}
}