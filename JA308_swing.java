//import java.util.Scanner;
import javax.swing.JOptionPane;

public class JA308_swing {
	public static void main(String args[]) {
		int j = 0;
		int k = 0;
		do {
			k = Integer.valueOf(JOptionPane.showInputDialog("�п�J���O���B�A�ο�J-1�����G"));
			if (k == -1)
				break;
			j = j + k;
		} while (k != -1);
		JOptionPane.showMessageDialog(null, "�q���g���`���O�G" + j);
//		System.out.println("�q���g���`���O�G" + j);
	}
}