import java.util.Scanner;

public class JA304_while {
	static int i = -1;

	public static void main(String args[]) {
		// 1.�ŧij���`���B,l���X�D�\�I
		int j = 0;
		int l = 0;
		int k = 0;
		Scanner keyboard = new Scanner(System.in);
		// System.out.print("Please enter meal dollars or enter -1 to stop: ");
		// 2.�j���Jk���\�I�O��-1 �Y���}
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
		System.out.println("�\�I�`�O��:" + j);
		System.out.printf(" %d �D�\�I�����O�ά�: %.2f %n", l, (double) j / l);
	}
}