import java.util.Scanner;

public class JA304_while {
	static int i = -1;

	public static void main(String args[]) {
		// 1.宣告j為總金額,l為幾道餐點
		int j = 0;
		int l = 0;
		int k = 0;
		Scanner keyboard = new Scanner(System.in);
		// System.out.print("Please enter meal dollars or enter -1 to stop: ");
		// 2.迴圈輸入k為餐點費用-1 即跳開
		// for (int k = keyboard.nextInt(); k != i; k = keyboard.nextInt()) {
		// j =j+ k;
		// l++;
		// System.out.print("Please enter meal dollars or enter -1 to stop: ");
		// }
		while (k != -1) {
			System.out.print("Please enter meal dollars or enter -1 to stop: ");
			k = keyboard.nextInt();
			if (k != -1){
				j = j + k;
			l++;}
		}
		System.out.println("餐點總費用:" + j);
		System.out.printf(" %d 道餐點平均費用為: %.2f %n", l, (double) j / l);
	}
}