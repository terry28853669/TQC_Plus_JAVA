import java.util.Scanner;

public class JA308 {
	public static void main(String args[]) {
		int j = 0;
		int k = 0;
		do {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("�п�J���O���B�A�ο�J-1�����G");
			k = keyboard.nextInt();
			if (k == -1)
				break;
			j = j + k;
		} while (k != -1);
		System.out.println("�q���g���`���O�G" + j);
	}
}