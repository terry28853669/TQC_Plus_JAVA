public class JVD101_4 {
	public static void main(String[] args) {
		// 1.宣告一個陣列
		int num[] = new int[7];
		int i;
		boolean flag = false;
		// 2.隨機跑一個數
		for (i = 0; i <= 6; i++) {
			do {
				num[i] = (int) (Math.random() * 42) + 1;
				// 第一次不用判斷
				if (i != 0) {
					// 3.判斷是否重複
					for (int j = 0; j < i; j++) {
						if (num[i] == num[j]) {
							flag = true;
						}
					}
				}
			} while (flag);

			// 4.輸出結果
			// 判斷是否為特別號
			if (i < 6) {
				System.out.print("第" + (i + 1) + "個號碼:");
			} else {
				System.out.print("特別號:");
			}
			// 判斷是否為個位數
			if (num[i] < 10) {
				System.out.println("0" + num[i]);
			} else {
				System.out.println(num[i]);
			}
		}
	}
}