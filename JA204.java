import java.util.Scanner;
public class JA204 {
	public static void main(String args[]) {
		test();
		test();
	}
	public static void test() {
		//1.�ŧiinput����
		Scanner input = new Scanner(System.in);
		System.out.println("Input:");
		//2.���o�ϥΪ̿�J�����
		int i = input.nextInt();
		//3.�P�_�O�_��Q5��9�㰣
		if (i % 5 == 0 && i % 9 == 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}