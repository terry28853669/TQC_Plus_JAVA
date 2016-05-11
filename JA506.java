public class JA506 {
	public static void main(String args[]) {
		int i = 0;
		int[][][] ai= {{ { 1, 2, 3 }, { 4, 5, 6 } },
				{ { 7, 8, 9 }, { 10, 11, 12 } },
				{ { 13, 14, 15 }, { 16, 17, 18 } },
				{ { 19, 20, 21 }, { 22, 23, 24 } }};
		
		for (int j = 0; j < 4; j++) {
			for (int k = 0; k < 2; k++) {
				for (int l = 0; l < 3; l++)
					i =i+ ai[j][k][l];
			}
		}
		System.out.printf("sum = %d\n", i);
	}
}