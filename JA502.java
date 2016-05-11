import java.util.Scanner;

public class JA502 {
	public static void main(String args[]) {
		System.out.print("請輸入學生人數：");
		Scanner keyboard = new Scanner(System.in);
		int i = keyboard.nextInt();
		float[] af = new float[i];
		float sum = 0.0f;
		for (int j = 0; j < af.length; j++) {
			System.out.print("第" + (j + 1) + "個學生的成績：");
			af[j] = keyboard.nextFloat();
			sum = sum + af[j];
		}

		System.out.println("人數：" + i + "\n總分：" + sum + "\n平均：" + (sum / i));
	}

}
