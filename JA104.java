import java.util.Scanner;

public class JA104 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��J��1�ժ�x�My�y�СG");
		double d = scanner.nextDouble();
		double d1 = scanner.nextDouble();
		System.out.print("��J��2�ժ�x�My�y�СG");
		double d2 = scanner.nextDouble();
		double d3 = scanner.nextDouble();
		//Math.sqrt �D����� ; Math.pow �D�X����
		double d4 = Math.sqrt(Math.pow(d - d2, 2) + Math.pow(d1 - d3, 2));
		System.out.printf("����(%.2f,%.2f)�M(%.2f,%.2f)�������Z���O %.2f�C\n",d, d1,d2, d3,d4);
	}

}
