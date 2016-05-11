import java.util.Scanner;
public class JA204 {
	public static void main(String args[]) {
		test();
		test();
	}
	public static void test() {
		//1.宣告input物件
		Scanner input = new Scanner(System.in);
		System.out.println("Input:");
		//2.取得使用者輸入的整數
		int i = input.nextInt();
		//3.判斷是否能被5或9整除
		if (i % 5 == 0 && i % 9 == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}