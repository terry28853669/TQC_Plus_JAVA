public class JVD101_4 {
	public static void main(String[] args) {
		// 1.�ŧi�@�Ӱ}�C
		int num[] = new int[7];
		int i;
		boolean flag = false;
		// 2.�H���]�@�Ӽ�
		for (i = 0; i <= 6; i++) {
			do {
				num[i] = (int) (Math.random() * 42) + 1;
				// �Ĥ@�����ΧP�_
				if (i != 0) {
					// 3.�P�_�O�_����
					for (int j = 0; j < i; j++) {
						if (num[i] == num[j]) {
							flag = true;
						}
					}
				}
			} while (flag);

			// 4.��X���G
			// �P�_�O�_���S�O��
			if (i < 6) {
				System.out.print("��" + (i + 1) + "�Ӹ��X:");
			} else {
				System.out.print("�S�O��:");
			}
			// �P�_�O�_���Ӧ��
			if (num[i] < 10) {
				System.out.println("0" + num[i]);
			} else {
				System.out.println(num[i]);
			}
		}
	}
}