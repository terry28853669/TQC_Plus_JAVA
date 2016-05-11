import java.util.Scanner;

public class JA104 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("輸入第1組的x和y座標：");
		double d = scanner.nextDouble();
		double d1 = scanner.nextDouble();
		System.out.print("輸入第2組的x和y座標：");
		double d2 = scanner.nextDouble();
		double d3 = scanner.nextDouble();
		//Math.sqrt 求平方根 ; Math.pow 求幾次方
		double d4 = Math.sqrt(Math.pow(d - d2, 2) + Math.pow(d1 - d3, 2));
		System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是 %.2f。\n",d, d1,d2, d3,d4);
	}

}
