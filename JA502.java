import java.util.Scanner;

public class JA502 {
	public static void main(String args[]) {
		System.out.print("�п�J�ǥͤH�ơG");
		Scanner keyboard = new Scanner(System.in);
		int i = keyboard.nextInt();
		float[] af = new float[i];
		float sum = 0.0f;
		for (int j = 0; j < af.length; j++) {
			System.out.print("��" + (j + 1) + "�Ӿǥͪ����Z�G");
			af[j] = keyboard.nextFloat();
			sum = sum + af[j];
		}

		System.out.println("�H�ơG" + i + "\n�`���G" + sum + "\n�����G" + (sum / i));
	}

}
