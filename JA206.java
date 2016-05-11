import java.util.Scanner;
public class JA206 {
	public static void main(String args[]) {
		test();
		test();
		test();
		test();
	}
	static void test() {
		//1.宣告keyboard物件
		Scanner keyboard = new Scanner(System.in);
		//2.取得成績
		System.out.print("Input Chinese score:");
		int i = keyboard.nextInt();
		System.out.print("Input English score:");
		int j = keyboard.nextInt();
		System.out.print("Input Math score:");
		int k = keyboard.nextInt();
		//3.判斷是否及格
		if (i >= 60 && j >= 60 && k >= 60) {
			System.out.println("All pass.");
		} else {
			if (i < 60)
				System.out.println("Chinese failed.");
			if (j < 60)
				System.out.println("English failed.");
			if (k < 60)
				System.out.println("Math failed.");
		}
	}
}
