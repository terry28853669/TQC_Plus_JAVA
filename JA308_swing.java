//import java.util.Scanner;
import javax.swing.JOptionPane;

public class JA308_swing {
	public static void main(String args[]) {
		int j = 0;
		int k = 0;
		do {
			k = Integer.valueOf(JOptionPane.showInputDialog("請輸入消費金額，或輸入-1結束："));
			if (k == -1)
				break;
			j = j + k;
		} while (k != -1);
		JOptionPane.showMessageDialog(null, "電腦週邊總消費：" + j);
//		System.out.println("電腦週邊總消費：" + j);
	}
}